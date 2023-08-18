package com.test.service;

import com.test.entity.User;

/**
 * ClassName: UserService
 * Package: com.test.service
 *
 * @author yovinchen
 * @Create 2023/8/14 17:05
 */
public interface UserService {
    User getUserById(int uid);

    int getRemain(int uid);

    boolean setRemain(int uid, int count);
}
