package com.artifactory.multi.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.artifactory.multi.module.messaging.Project;


@SpringBootApplication
public class ProjectExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectExampleApplication.class, args);
		Project project = new Project();
		 
	}
}
