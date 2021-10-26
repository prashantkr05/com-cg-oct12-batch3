package com.cg.oct12.batch3.day5.Polymorphe;

public class Parent {
	// method overriding 

		public void someMethod() {
			System.out.println("some method from parent");
		}

	}

	class Child extends Parent {

		@Override
		public void someMethod() {
			System.out.println("some method from child");
		}

	}

//	public class SomeClass {
//
//
//
//	}

