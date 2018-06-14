package com.eureka.ribbon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaRibbonApplication {

	public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaRibbonApplication.class).web(true).run(args);
	}
}
