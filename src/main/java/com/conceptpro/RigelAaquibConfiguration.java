package com.conceptpro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.conceptpro.withbean.TestFlowSpring;
import com.conceptpro.withoutbean.Developer;
import com.conceptpro.withoutbean.ProductOwner;
import com.conceptpro.withoutbean.ScrumMaster;
import com.conceptpro.withoutbean.TestFlow;
import com.conceptpro.withoutbean.Tester;

@Configuration
public class RigelAaquibConfiguration {

	@Bean
	public Tester tester() {
		return new Tester();
	}

	@Bean
	public Developer developer() {
		return new Developer();
	}

	@Bean
	public ScrumMaster scrumMaster() {
		return new ScrumMaster();
	}

	@Bean
	public ProductOwner productOwner() {
		return new ProductOwner();
	}

	@Bean
	public TestFlowSpring testFlowSpring() {
		return new TestFlowSpring();
	}

}
