package com.test.service;

import com.test.entity.User;
import com.test.entity.UserBorrowDetail;

/**
 * ClassName: BorrowService
 * Package: com.test.service
 *
 * @author yovinchen
 * @Create 2023/8/14 17:04
 */
public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(int uid);
    boolean doBorrow(int uid, int bid);
}
