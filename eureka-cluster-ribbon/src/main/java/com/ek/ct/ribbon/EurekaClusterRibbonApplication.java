package com.ek.ct.ribbon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClusterRibbonApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaClusterRibbonApplication.class).web(true).run(args);
	}
}
