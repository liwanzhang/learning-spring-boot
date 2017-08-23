package zwl.learning.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangwanli
 * @description
 * @date 2017-07-21 上午1:22
 */
@Controller
public class UserController {
    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello world";
    }
}
