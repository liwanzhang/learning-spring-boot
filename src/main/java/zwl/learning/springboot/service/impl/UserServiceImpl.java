package zwl.learning.springboot.service.impl;

import zwl.learning.springboot.service.UserService;

/**
 * @author zhangwanli
 * @description
 * @date 2017-07-21 上午1:16
 */
public class UserServiceImpl implements UserService {
    public String getUserName() {
        System.out.println("Being invoked");
        return "test user";
    }
}
