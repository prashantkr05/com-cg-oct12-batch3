package com.cg.oct12.batch3.day5.MultiThreading;

public class Synchronized {
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {
	Synchronized t;

	MyThread1(Synchronized t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Synchronized t;

	MyThread2(Synchronized t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
public class Synchronized{
	public static void main(String args[]) {
		Synchronized obj = new Synchronized();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
	}
}
