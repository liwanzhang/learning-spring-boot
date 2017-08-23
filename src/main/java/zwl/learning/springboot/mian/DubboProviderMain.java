package zwl.learning.springboot.mian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zhangwanli
 * @description
 * @date 2017-07-21 上午1:17
 */
@ImportResource("classpath:spring/applicationContext-dubbo-provider.xml")
@ComponentScan("zwl.learning.springboot.web")
@SpringBootApplication
public class DubboProviderMain {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DubboProviderMain.class, args);
    }
}