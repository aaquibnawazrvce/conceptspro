package com.conceptpro.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShopExampleUsingBuilder {

	public static void main(String s[]) {

		Mobile mobile = new MobileBuilder().setOs("Andriod").getMyMobile();

		log.info("My First Mobile is " + mobile);

		Mobile mobile1 = new MobileBuilder().setOs("Mac").setScreensize(8)
				.getMyMobile();

		log.info("My Second Mobile is " + mobile1);
	}

}
