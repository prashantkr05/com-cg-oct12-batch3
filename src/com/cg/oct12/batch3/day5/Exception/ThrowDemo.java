package com.cg.oct12.batch3.day5.Exception;

import java.util.Scanner;

public class ThrowDemo {
	static void checkEligibilty(int age) {

		if (age < 18) {
			throw new CanNotVoteException("Can not vote.");
		} else {
			System.out.println("Vote for India.");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Age");
		int n = sc.nextInt();
		System.out.println("Election...");

		try {
			ThrowDemo.checkEligibilty(n);
		} catch (CanNotVoteException cnve) {
			System.out.println(cnve.getMessage());
		}
		System.out.println("end");
	}

}
