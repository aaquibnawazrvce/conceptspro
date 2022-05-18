package com.conceptpro.builder;

public class MobileBuilder {
	
	private String os;
	public MobileBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public MobileBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public MobileBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public MobileBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public MobileBuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	private int ram;
	private int battery;
	private String processor;
	private double screensize;


	public Mobile getMyMobile(){
		return new Mobile(os, ram, battery, processor, screensize);
	}

}
