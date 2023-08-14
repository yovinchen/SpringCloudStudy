package com.test.entity;

import lombok.Data;

/**
 * ClassName: User
 * Package: com.test.entity
 *
 * @author yovinchen
 * @Create 2023/8/14 17:01
 */
@Data
public class User {
    int uid;
    String name;
    String sex;

    /**
     * ClassName: Book
     * Package: com.test.entity
     *
     * @author yovinchen
     * @Create 2023/8/14 17:01
     */
    @Data
    public static class Book {
        int bid;
        String title;
        String desc;
    }
}
