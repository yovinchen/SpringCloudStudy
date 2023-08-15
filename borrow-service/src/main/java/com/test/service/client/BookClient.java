package com.test.service.client;

import com.test.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: VookClient
 * Package: com.test.service.client
 *
 * @author yovinchen
 * @Create 2023/8/15 16:56
 */
@FeignClient(value = "bookservice", fallback = BookFallbackClient.class)
public interface BookClient {
    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid);
}
