package com.conceptpro.withbean;

import org.springframework.beans.factory.annotation.Autowired;

import com.conceptpro.withoutbean.Developer;
import com.conceptpro.withoutbean.ProductOwner;
import com.conceptpro.withoutbean.ScrumMaster;
import com.conceptpro.withoutbean.Tester;

public class TestFlowSpring {

	@Autowired
	private ProductOwner productOwner;

	@Autowired
	private ScrumMaster scrumMaster;

	@Autowired
	private Developer developer;

	@Autowired
	private Tester tester;

	public void executeAllTeamTasks() {

		productOwner.taskProductOwner();

		scrumMaster.taskScrumMaster();

		developer.taskDeveloper();

		tester.testerTask();

	}

}
