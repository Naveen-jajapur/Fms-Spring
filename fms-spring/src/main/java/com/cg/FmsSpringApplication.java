package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.cg.fms.dao")
//@EnableDiscoveryClient
public class FmsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FmsSpringApplication.class, args);
	}

}
