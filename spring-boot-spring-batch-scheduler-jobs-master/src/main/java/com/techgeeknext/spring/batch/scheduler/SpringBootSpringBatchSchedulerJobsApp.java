package com.techgeeknext.spring.batch.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringBootSpringBatchSchedulerJobsApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpringBatchSchedulerJobsApp.class, args);
		System.out.println("Kishore");
	}

}
