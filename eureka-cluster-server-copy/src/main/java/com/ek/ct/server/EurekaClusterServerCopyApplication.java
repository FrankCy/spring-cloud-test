package com.ek.ct.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class EurekaClusterServerCopyApplication {

	public static void main(String[] args) {
		System.out.println("start server");
		Scanner scanner = new Scanner(System.in);
		String profiles = scanner.nextLine();
		new SpringApplicationBuilder(EurekaClusterServerCopyApplication.class).profiles(profiles).run(args);
	}
}
