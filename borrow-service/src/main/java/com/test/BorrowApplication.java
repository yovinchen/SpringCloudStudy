package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * ClassName: BorrowApplication
 * Package: com.test
 *
 * @author yovinchen
 * @Create 2023/8/14 16:25
 * <p>
 * 如果先使用 @EnableResourceServer 注解，再使用 @EnableFeignClients 注解，则 Feign 客户端可能无法正常工作。
 * 因为在启用资源服务器之后，Spring Security 会拦截所有请求并进行身份验证和授权处理。
 * 而 Feign 客户端发送请求时也需要经过 Spring Security 的处理流程，如果没有正确配置权限规则，则可能导致访问被拒绝或者出现其他错误。
 */
@EnableFeignClients
@EnableResourceServer
@SpringBootApplication
public class BorrowApplication {
    public static void main(String[] args) {
        SpringApplication.run(BorrowApplication.class, args);
    }
}
