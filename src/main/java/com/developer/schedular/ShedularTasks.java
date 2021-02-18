package com.developer.schedular;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ShedularTasks {

	private static final Logger logger = LoggerFactory.getLogger(ShedularTasks.class);

	@Scheduled(cron = "0 * * * * ?")
	public void scheduleTaskWithCronExpression() {
		logger.info("Cron Task :: Execution Time - {}", LocalDateTime.now());
	}
}
