package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * ClassName: entity.com.test.filter.UserBorrowDetail
 * Package: PACKAGE_NAME
 *
 * @author yovinchen
 * @Create 2023/8/14 21:22
 */
@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
