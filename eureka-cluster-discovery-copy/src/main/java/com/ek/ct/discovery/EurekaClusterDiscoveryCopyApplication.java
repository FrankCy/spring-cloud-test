package com.ek.ct.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClusterDiscoveryCopyApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaClusterDiscoveryCopyApplication.class).web(true).run(args);
	}
}
