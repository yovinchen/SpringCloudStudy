package com.test.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.fastjson.JSONObject;
import com.test.entity.UserBorrowDetail;
import com.test.service.BorrowService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;


/**
 * ClassName: BorrowController
 * Package: com.test.controller
 *
 * @author yovinchen
 * @Create 2023/8/14 21:30
 */
@RestController
public class BorrowController {

    @Resource
    BorrowService service;

    @RequestMapping("/borrow1/{uid}")
    UserBorrowDetail findUserBorrows1(@PathVariable("uid") int uid) {
        return service.getUserBorrowDetailByUid(uid);
    }

    @RequestMapping("/borrow2/{uid}")
    UserBorrowDetail findUserBorrows2(@PathVariable("uid") int uid) {
        return service.getUserBorrowDetailByUid(uid);
    }

    @RequestMapping("/blocked")
    JSONObject blocked() {
        JSONObject object = new JSONObject();
        object.put("code", 403);
        object.put("success", false);
        object.put("massage", "您的请求频率过快，请稍后再试！");
        return object;
    }

//    @RequestMapping("/test")
//    @SentinelResource(value = "test", fallback = "except",    //fallback指定出现异常时的替代方案
//            blockHandler = "blocked",
////            特别注意这种方式会在没有配置blockHandler的情况下，将Sentinel机制内（也就是限流的异常）的异常也一并处理了，如果配置了blockHandler，那么在出现限流时，依然只会执行blockHandler指定的替代方案（因为限流是在方法执行之前进行的）
//            exceptionsToIgnore = IOException.class)
//        //忽略那些异常，也就是说这些异常出现时不使用替代方案
//    String test() {
//        throw new RuntimeException("HelloWorld！");
//    }
//
//    //替代方法必须和原方法返回值和参数一致，最后可以添加一个Throwable作为参数接受异常
//    String except(Throwable t) {
//        return t.getMessage();
//    }
    @RequestMapping("/test")
    @SentinelResource("test")   //注意这里需要添加@SentinelResource才可以，用户资源名称就使用这里定义的资源名称
    String findUserBorrows2(@RequestParam(value = "a", required = false) String a,
                            @RequestParam(value = "b", required = false) String b,
                            @RequestParam(value = "c",required = false) String c) {
        return "请求成功！a = "+a+", b = "+b+", c = "+c;
    }

    //模拟慢调用
    @RequestMapping("/slowCall/{uid}")
    String slowCall(@PathVariable("uid") int uid) throws InterruptedException {
        //模拟慢调用
        Thread.sleep(1000);
        return "Hello World";
    }
}
