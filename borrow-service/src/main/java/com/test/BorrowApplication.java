package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: BorrowApplication
 * Package: com.test
 *
 * @author yovinchen
 * @Create 2023/8/14 16:25
 */
@SpringBootApplication
@EnableEurekaClient
public class BorrowApplication {
    public static void main(String[] args) {
        SpringApplication.run(BorrowApplication.class, args);
    }
}
