package com.cg.oct12.batch3day5.inheritance;

public class SmartPhone extends FeaturedPhone {

	void camera() {
		System.out.println("Snap a pic");
	}

	@Override
	void music() {
		System.out.println("Play music with Dolby");
	}
}
