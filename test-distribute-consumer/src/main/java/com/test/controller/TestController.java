package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.template.DemoTemplate;

@Controller
@RequestMapping("/testController")
public class TestController {

	static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private DemoTemplate demoTemplate;
	
	@ResponseBody
	@RequestMapping(value="/test", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public void test(){
		try {
			String name= "Hero鹏";
			
			logger.info("前");
			
			String response = demoTemplate.save(name);
			logger.info("response: "+response);
			
			demoTemplate.delete(name);
			
			logger.info("后");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}




