package com.test.service;

import com.test.entity.Book;

/**
 * ClassName: BookService
 * Package: com.test.service
 *
 * @author yovinchen
 * @Create 2023/8/14 17:03
 */
public interface BookService {
    Book getBookById(int bid);

    boolean setRemain(int uid, int i);

    int getRemain(int uid);


}
