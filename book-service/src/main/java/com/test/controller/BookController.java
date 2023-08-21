package com.test.controller;

import com.test.service.BookService;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import com.test.entity.Book;

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
    Book findBookById(@PathVariable("bid") int bid){
        //通过SecurityContextHolder将用户信息取出
        SecurityContext context = SecurityContextHolder.getContext();
        System.out.println(context.getAuthentication());
        return service.getBookById(bid);
    }
}
