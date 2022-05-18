package com.conceptpro.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShopExample {

	public static void main(String s[]) {
		// Mobile(String os, int ram, int battery, String processor,double
		// screensize)
		Mobile mobilePhone = new Mobile("Andriod", 256, 80, "Intel", 5);
		log.info(mobilePhone.toString());
		Mobile mobilePhone1 = new Mobile("Mac", 256, 80, "Intel", 5);
		log.info(mobilePhone1.toString());
	}

}
