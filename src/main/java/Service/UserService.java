package Service;

import Vo.User;

import java.util.List;
import java.util.Set;

/**
 * Created by pc on 2018/1/20.
 */
public interface UserService {
    /**
    *describe:通过用户名查询用户
    *@author xxx
    *@date4 {YEAR}/${MONTH}/${DAY}
    */
    public User getByUserName(String username);
    /**
    *describe:t通过用户名查询角色信息
    *@author xxx
    *@date4 {YEAR}/${MONTH}/${DAY}
    */
    public Set<String> getRoles(String username);
    /**
    *describe:通过用户名查询权限信息
    *@author xxx
    *@date4 {YEAR}/${MONTH}/${DAY}
    */
    public Set<String> getPermissions(String username);
}