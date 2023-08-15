package com.test.service.client;

import com.test.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: UserClient
 * Package: com.test.service.client
 *
 * @author yovinchen
 * @Create 2023/8/15 16:54
 */
@FeignClient("userservice")
//声明为userservice服务的HTTP请求客户端
public interface UserClient {

    //路径保证和其他微服务提供的一致即可
    @RequestMapping("/user/{uid}")
    User getUserById(@PathVariable("uid") int uid);  //参数和返回值也保持一致
}
