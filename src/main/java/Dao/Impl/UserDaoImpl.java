package Dao.Impl;/**
 * Created by pc on 2018/1/21.
 */

import Dao.UserDao;
import Vo.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

/**
 * describe:
 *
 * @author xxx
 * @date4 {YEAR}/01/21
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public User getByUserName(String username) {
        return getSqlSession().selectOne("Vo.UserMapper.getByUserName",username) ;
    }

    public String getRoles(String username) {
        return getSqlSession().selectOne("Vo.UserMapper.getRoles",username);
    }

    public String getPermissions(String username) {
        return getSqlSession().selectOne("Vo.UserMapper.getPermissions",username);
    }
}
