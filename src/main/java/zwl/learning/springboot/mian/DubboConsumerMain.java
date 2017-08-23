package zwl.learning.springboot.mian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zwl.learning.springboot.service.UserService;

/**
 * @author zhangwanli
 * @description
 * @date 2017-07-21 上午1:17
 */

@ImportResource("classpath:spring/applicationContext-dubbo-consumer.xml")
@Controller
//@EnableAutoConfiguration
@SpringBootApplication
public class DubboConsumerMain extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

    @Autowired
    private UserService userService2;

    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return userService2.getUserName();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DubboConsumerMain.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DubboConsumerMain.class);
    }

    //修改启动端口
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8081);
    }
}