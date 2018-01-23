package Dao;

import Vo.User;

import java.util.List;

/**
 * Created by pc on 2018/1/20.
 */
public interface UserDao {
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
    public String getRoles(String username);
    /**
    *describe:通过用户名查询权限信息
    *@author xxx
    *@date4 {YEAR}/${MONTH}/${DAY}
    */
    public String getPermissions(String username);
}