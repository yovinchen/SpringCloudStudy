package com.test;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: UserApplication
 * Package: com.test
 *
 * @author yovinchen
 * @Create 2023/8/14 16:26
 */
@SpringBootApplication
@EnableAutoDataSourceProxy
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
