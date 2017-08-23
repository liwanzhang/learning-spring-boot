package zwl.learning.springboot.config;

import com.alibaba.dubbo.config.spring.ReferenceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangwanli
 * @description Dubbo消费者配置，需要继承Dubbo基础配置
 * @date 2017-07-21 上午1:01
 */
@Configuration
public class ConsumerConfigs extends DubboBaseConfigs {

    @Bean
    public ReferenceBean<Person> person() {
        ReferenceBean<Person> ref = new ReferenceBean<>();
        ref.setVersion("myversion");
        ref.setInterface(Person.class);
        ref.setTimeout(5000);
        ref.setRetries(3);
        ref.setCheck(false);
        return ref;
    }
}