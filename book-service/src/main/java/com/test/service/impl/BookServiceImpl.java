package com.test.service.impl;

import com.test.mapper.BookMapper;
import com.test.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import com.test.entity.Book;

/**
 * ClassName: BookServiceImpl
 * Package: com.test.service.impl
 *
 * @author yovinchen
 * @Create 2023/8/14 17:09
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper mapper;

    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}
