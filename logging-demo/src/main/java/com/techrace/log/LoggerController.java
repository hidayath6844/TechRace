package com.techrace.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logger")
public class LoggerController {

	private Logger logger = LoggerFactory.getLogger(LoggerController.class);
	
	@GetMapping("/log")
	public String log()
	{
		for(int i=0;i<10;i++)
		{
			logger.info("Logging******* :"+i);
		}
		return "Logging successfull!!";
	}
	
}
