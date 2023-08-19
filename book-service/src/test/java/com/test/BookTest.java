package com.test;

import com.test.mapper.BookMapper;
import com.test.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * ClassName: BookTest
 * Package: com.test
 *
 * @author yovinchen
 * @Create 2023/8/19 12:58
 */
@SpringBootTest
public class BookTest {
    @Resource
    private BookService service;

    @Autowired
    private BookMapper bookMapper;
    @Test
    public void bookTest(){
        System.out.println(bookMapper.getBookById(1));
        System.out.println(service.getBookById(1));
    }
}
