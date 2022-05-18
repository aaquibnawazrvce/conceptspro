package com.conceptpro.builder;

public class Mobile {

	private String os;
	private int ram;
	private int battery;
	private String processor;
	private double screensize;

	public Mobile(String os, int ram, int battery, String processor,
			double screensize) {
		super();
		this.os = os;
		this.ram = ram;
		this.battery = battery;
		this.processor = processor;
		this.screensize = screensize;
	}

	@Override
	public String toString() {
		return "Mobile [os=" + os + ", ram=" + ram + ", battery=" + battery
				+ ", processor=" + processor + ", screensize=" + screensize
				+ "]";
	}
	
}
