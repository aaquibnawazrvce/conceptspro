package com.conceptpro.withoutbean;

public class TestFlow {

	public void executeAllTeamTasks() {

		ProductOwner productOwner = new ProductOwner();
		productOwner.taskProductOwner();

		ScrumMaster scrumMaster = new ScrumMaster();
		scrumMaster.taskScrumMaster();

		Developer developer = new Developer();
		developer.taskDeveloper();

		Tester tester = new Tester();
		tester.testerTask();

	}

}
