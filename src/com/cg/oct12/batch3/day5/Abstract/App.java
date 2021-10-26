package com.cg.oct12.batch3.day5.Abstract;
//abstract method - 

//has the keyword abstract 
//has only method signature 
//does not have method body 
//can be defined in abstract class 
//can not be defined in concrete class 

//abstract class 
//has the keyword abstract 
//object can not be created 
//can contain zero or more abstract methods 
//can contain zero or more concrete methods 
//can also contain both 
//------------------------
//interface 
//mainly contain abstract methods 
//from java 8, also contain static and default methods 
//allow multiple inheritance in java 


interface FinanceMinistry {

	public abstract void payInterestOnDeposits();

}

interface StateGovt {

	public abstract void paySalaryToEmployees();

}

abstract class Rbi {

	abstract void doKyc(); // Aadhaar, PAN, Passport, ...

	void openAccount() {
		System.out.println("open account");
	}

	void payLoans() {
		System.out.println("pay loans");
	}
}

class HdfcBank extends Rbi implements FinanceMinistry, StateGovt {

	@Override
	void doKyc() {
		System.out.println("Aadhaar");
	}

	@Override
	public void paySalaryToEmployees() {
		System.out.println("salary");

	}

	@Override
	public void payInterestOnDeposits() {
		System.out.println("Interest");

	}

}

class IciciBank extends Rbi {

	@Override
	void doKyc() {
		System.out.println("PAN Card");
	}
}

public class App {

	public static void main(String[] args) {

		HdfcBank obj = new HdfcBank();
		obj.doKyc();
		obj.openAccount();
		obj.payLoans();
		obj.payInterestOnDeposits();
		obj.paySalaryToEmployees();
		IciciBank obj2 = new IciciBank();
		obj2.doKyc();
	}

}
