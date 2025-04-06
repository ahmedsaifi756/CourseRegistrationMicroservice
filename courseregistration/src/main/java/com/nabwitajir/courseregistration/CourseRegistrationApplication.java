package com.nabwitajir.courseregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CourseRegistrationApplication {
	public static void main(String[] args) {
		SpringApplication.run(CourseRegistrationApplication.class, args);
	}
}
