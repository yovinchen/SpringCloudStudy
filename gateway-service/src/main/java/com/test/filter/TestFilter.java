package com.test.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * ClassName: filterTestFilter
 * Package: com.test
 *
 * @author yovinchen
 * @Create 2023/8/16 08:51
 */
@Component   //需要注册为Bean
public class TestFilter implements GlobalFilter , Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //先获取ServerHttpRequest对象，注意不是HttpServletRequest
        ServerHttpRequest request = exchange.getRequest();
        //打印一下所有的请求参数
        System.out.println(request.getQueryParams());
        //判断是否包含test参数，且参数值为1
        List<String> value = request.getQueryParams().get("test");
        if(value != null && value.contains("1")) {
            //将ServerWebExchange向过滤链的下一级传递（跟JavaWeb中介绍的过滤器其实是差不多的）
            return chain.filter(exchange);
        }else {
            //直接在这里不再向下传递，然后返回响应
            return exchange.getResponse().setComplete();
        }
    }

    //设置过滤等级（越小优先级越高）
    @Override
    public int getOrder() {
        return 0;
    }
}
