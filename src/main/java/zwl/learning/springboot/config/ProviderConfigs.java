package zwl.learning.springboot.config;

import com.alibaba.dubbo.config.spring.ServiceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description Dubbo生产者配置，需要继承Dubbo基础配置
 * @author zhangwanli
 * @date 2017-07-21 上午1:00
 */
@Configuration
public class ProviderConfigs extends DubboBaseConfigs {

//    @Bean
//    public ServiceBean<Person> personServiceExport(Person person) {
//        ServiceBean<Person> serviceBean = new ServiceBean<Person>();
//        serviceBean.setProxy("javassist");
//        serviceBean.setVersion("myversion");
//        serviceBean.setInterface(Person.class.getName());
//        serviceBean.setRef(person);
//        serviceBean.setTimeout(5000);
//        serviceBean.setRetries(3);
//        return serviceBean;
//    }

}
