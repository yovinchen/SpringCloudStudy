package com.test.service.client;

import com.test.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: BookClient
 * Package: com.test.service.client
 *
 * @author yovinchen
 * @Create 2023/8/16 10:55
 */
@FeignClient("bookservice")
public interface BookClient {

    @RequestMapping("/book/{bid}")
    Book getBookById(@PathVariable("bid") int bid);

    @RequestMapping("/book/borrow/{bid}")
    boolean bookBorrow(@PathVariable("bid") int bid);

    @RequestMapping("/book/remain/{bid}")
    int bookRemain(@PathVariable("bid") int bid);
}
