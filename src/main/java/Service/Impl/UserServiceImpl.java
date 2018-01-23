package Service.Impl;/**
 * Created by pc on 2018/1/20.
 */

import Dao.UserDao;
import Service.UserService;
import Vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * describe:
 *
 * @author xxx
 * @date4 {YEAR}/01/20
 */
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getByUserName(String username) {
        return userDao.getByUserName(username);
    }

    public Set<String> getRoles(String username) {
        Set<String>temp = new HashSet<String>();
        temp.add(userDao.getRoles(username));
        return temp;
    }

    public Set<String> getPermissions(String username) {
        Set<String>temp = new HashSet<String>();
        temp.add(userDao.getPermissions(username));
        return temp;
    }
}
