package com.test.controller;

import com.test.entity.Book;
import com.test.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName: BookController
 * Package: com.test.controller
 *
 * @author yovinchen
 * @Create 2023/8/14 17:11
 */
@RestController
public class BookController {

    @Resource
    BookService service;

    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid) {
        System.out.println("调用图书服务");
        return service.getBookById(bid);
    }

    @RequestMapping("/book/remain/{bid}")
    public int bookRemain(@PathVariable("bid") int uid){
        return service.getRemain(uid);
    }

    @RequestMapping("/book/borrow/{bid}")
    public boolean bookBorrow(@PathVariable("bid") int uid){
        int remain = service.getRemain(uid);
        return service.setRemain(uid, remain - 1);
    }
}
