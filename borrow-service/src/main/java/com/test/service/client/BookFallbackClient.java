package com.test.service.client;

import com.test.entity.Book;
import org.springframework.stereotype.Component;

/**
 * ClassName: BookFallbackClient
 * Package: com.test.service.client
 *
 * @author yovinchen
 * @Create 2023/8/15 20:37
 */
@Component   //注意，需要将其注册为Bean，Feign才能自动注入
public class BookFallbackClient implements BookClient {
    @Override
    public Book findBookById(int bid) {   //这里我们自行对其进行实现，并返回我们的替代方案
        Book book = new Book();
        book.setTitle("我是替代方案");
        return book;
    }
}
