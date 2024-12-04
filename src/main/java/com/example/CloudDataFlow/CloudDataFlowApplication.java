package com.example.CloudDataFlow;

import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@Slf4j
@SpringBootApplication
public class CloudDataFlowApplication {

//	private static final Logger logger = Logger.getLogger(String.valueOf(CloudDataFlowApplication.class));
//	private static final Logger logger = (Logger) LoggerFactory.getLogger(CloudDataFlowApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CloudDataFlowApplication.class, args);

		log.error("lỗi!!");
	}


}
