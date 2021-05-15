package com.sleuth.demo2;

import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SleuthDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SleuthDemo2Application.class, args);
	}

}

@RestController
class SleuthController2{

	@Autowired
	RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public Sampler alwaysSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

	private Logger LOG = LoggerFactory.getLogger(SleuthController2.class);

	@GetMapping(value="/sleuth2")
	public String sleuthService2()
	{
		LOG.info("Inside sleuthService 2..");
		return "Service 2";
	}
}