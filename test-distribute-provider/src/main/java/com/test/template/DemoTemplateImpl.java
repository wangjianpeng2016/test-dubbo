package com.test.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service("demoTemplate")
public class DemoTemplateImpl implements DemoTemplate {

	static final Logger logger = LoggerFactory.getLogger(DemoTemplateImpl.class);
	
	public String save(String name) throws Exception {
		
		Thread.sleep(2000);
		logger.info("服务端-save: "+name);
		
		return name;
	}

	public void delete(String name) throws Exception {
		
		logger.info("服务端-delete: "+name);
	}

}
