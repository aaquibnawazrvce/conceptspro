package com.conceptpro.withbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.conceptpro.RigelAaquibConfiguration;

public class TestFlowWithBean {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				RigelAaquibConfiguration.class);
	TestFlowSpring testFlowSpring =	(TestFlowSpring) ctx.getBean("testFlowSpring");
	
	testFlowSpring.executeAllTeamTasks();

	}

}
