package com.test.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;

import javax.annotation.Resource;

/**
 * ClassName: ma
 * Package: com.test.config
 *
 * @author yovinchen
 * @Create 2023/8/21 10:52
 */
@Configuration
public class WebConfiguration {

    @Resource
    OAuth2ClientContext context;

    @Bean
    @LoadBalanced
    public OAuth2RestTemplate restTemplate(){
        return new OAuth2RestTemplate(new ClientCredentialsResourceDetails(), context);
    }
}
