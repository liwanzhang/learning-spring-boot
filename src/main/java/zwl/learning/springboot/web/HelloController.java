package zwl.learning.springboot.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwanli
 * @description
 * @date 2017-07-21 上午12:21
 */
@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        System.out.println("go into controller");
        return "Hello World";
    }
}
