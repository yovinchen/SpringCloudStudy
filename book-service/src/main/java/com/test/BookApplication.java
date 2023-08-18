package com.test;

import com.apple.eawt.Application;
import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: BookApplication
 * Package: com.test
 *
 * @author yovinchen
 * @Create 2023/8/14 16:23
 */
@EnableAutoDataSourceProxy
@SpringBootApplication
public class BookApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class,args);
    }
}
