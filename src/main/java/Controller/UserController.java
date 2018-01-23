package Controller;/**
 * Created by pc on 2018/1/20.
 */

import Vo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import org.apache.shiro.subject.Subject;

/**
 * describe:
 *
 * @author xxx
 * @date4 {YEAR}/01/20
 */
@Controller
public class UserController {
    /**
    *describe:用户登录
    *@author xxx
    *@date4 {YEAR}/${MONTH}/${DAY}
    */
    @RequestMapping("/login")
    public String login(User user,HttpServletRequest req){
       Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
        try {
            subject.login(token);//到Realm进行身份验证
            Session session = subject.getSession();
            System.out.println("sessionid"+session.getId());
            System.out.println("sessionhost"+session.getHost());
            System.out.println("sessionTimeout"+session.getTimeout());
            session.setAttribute("info","session的数据");
            return "/success";

        }catch (Exception e){
            e.printStackTrace();
//            req.setAttribute("user",user);
            req.setAttribute("error","用户名或密码错误");
            return "/index";
        }
    }
}
