package Controller;/**
 * Created by pc on 2018/1/23.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * describe:
 *
 * @author xxx
 * @date4 {YEAR}/01/23
 */
@Controller
public class ToIndexController {
    @RequestMapping("/index")
    public String index(){
        return"/index";
    }
}
