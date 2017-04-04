package com.test.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("nofifyService")
public class NofifyService {

	static final Logger logger = LoggerFactory.getLogger(NofifyService.class);
	
	void onreturn(){
		logger.info("NofifyService.onreturn");
	}
}
