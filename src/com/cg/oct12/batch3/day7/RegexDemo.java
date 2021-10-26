package com.cg.oct12.batch3.day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {

		String regex = "abc", input = "aaaaabcdalsdnfkuyet";
		// String regex = "abc", input = "abcdalsdnfkuyet";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(input);

		System.out.println(matcher.matches());// this will check the pattern whatever sequence and length we mentioned
		System.out.println(matcher.lookingAt());// it will check mentioned letter comes 1st or not example line no 10
		// System.out.println(matcher.find());

	}
}
