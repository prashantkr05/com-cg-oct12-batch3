package com.cg.oct12.batch3.day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
	public static void main(String[] args) {

		String regex = "[a-zA-Z0-9#@]{5}", input = "P"; // abc xyz ijk // ABC 123
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(input);

		System.out.println(matcher.matches());
		System.out.println(matcher.lookingAt());
//		System.out.println(matcher.find());
		//{5} this is the length that we are providing for input
	}
}
