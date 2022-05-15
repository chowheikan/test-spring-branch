package com.ken.test.git.branch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class TestGitBranchApplication {
	public static Logger logger = LoggerFactory.getLogger(TestGitBranchApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TestGitBranchApplication.class, args);
	}

	@Scheduled(fixedDelay = 1000)
	public void testJob() {
		logger.debug("test job!");
	}

}
