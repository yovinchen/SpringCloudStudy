package com.test.service.client;

import com.test.entity.User;
import org.springframework.stereotype.Component;

/**
 * ClassName: UserClientImpl
 * Package: com.test.service.client
 *
 * @author yovinchen
 * @Create 2023/8/17 22:25
 */
@Component
public class UserClientImpl implements UserClient{
    @Override
    public User getUserById(int uid) {
        User user = new User();
        user.setName("我是替代方案");
        return user;
    }
}
