package com.sleuth.demo;



import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SleuthDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthDemoApplication.class, args);
	}

}

@RestController
class SleuthController{

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

	private Logger LOG = LoggerFactory.getLogger(SleuthController.class);

	@GetMapping(value="/sleuth")
	public String sleuthService1()
	{
		LOG.info("Inside sleuthService 1..");

		String response = (String) restTemplate.exchange("http://localhost:9002/sleuth2",
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();
		return response;
	}
}