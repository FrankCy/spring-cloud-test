package com.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-cloud-test
 * @package: com.eureka.server
 * @email: cy880708@163.com
 * @date: 2018/6/13 下午3:19
 * @mofified By:
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }

}
