package com.ek.ct.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description：
 * @version 1.0
 * @author: Yang.Chang
 * @email: cy880708@163.com
 * @date: 2018/6/15 下午3:19
 * @mofified By:
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClusterDiscoveryApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaClusterDiscoveryApplication.class).web(true).run(args);
	}
}
