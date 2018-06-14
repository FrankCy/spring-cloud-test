package com.eureka.ribbon.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-cloud-test
 * @package: com.eureka.ribbon.controller
 * @email: cy880708@163.com
 * @date: 2018/6/14 下午4:44
 * @mofified By:
 */
@Controller
@Configuration
public class TestController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        //调用Rest服务工具类 （在Spring web 下的类）
        return new RestTemplate();
    }

    @GetMapping("/router")
    @ResponseBody
    public String router() {
        RestTemplate tpl = getRestTemplate();
        //服务ID是：discovery pro.yml下的application:name
        String testJson = tpl.getForObject("http://eureka-discovery-1/call/5", String.class);
        return testJson;
    }
}
