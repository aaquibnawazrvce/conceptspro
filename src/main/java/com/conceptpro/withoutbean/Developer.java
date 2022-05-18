package com.conceptpro.withoutbean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Developer {

	public void taskDeveloper() {
		log.info("================  Developer Tasks Started ============================");
		log.info("Step1: Prepare Low Level Design");
		log.info("Step2: Implement the User Story");
		log.info("Step3: Add Junits/Postman");
		log.info("Step4: Perform Checkin/ Code Reviews/ Approval/Merge");
		log.info("================  Developer Tasks Ended ============================");
	}

}
