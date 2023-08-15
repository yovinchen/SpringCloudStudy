package com.test;

import com.apple.eawt.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName: BookApplication
 * Package: com.test
 *
 * @author yovinchen
 * @Create 2023/8/14 16:23
 */
@SpringBootApplication
@EnableEurekaClient
public class BookApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class,args);
    }
}
