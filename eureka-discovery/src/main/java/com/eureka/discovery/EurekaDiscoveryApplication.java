package com.eureka.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaDiscoveryApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaDiscoveryApplication.class).web(true).run(args);

	}
}
