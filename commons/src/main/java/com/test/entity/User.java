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
    int book_count;

    @Data
    public static class Book {
        int bid;
        String title;
        String desc;
        int book_count;
    }
}
