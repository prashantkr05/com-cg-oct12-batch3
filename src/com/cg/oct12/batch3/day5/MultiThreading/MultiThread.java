package com.cg.oct12.batch3.day5.MultiThreading;

public class MultiThread extends Thread{
	

		public void myLoop() {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}

		@Override
		public void run() {
			this.myLoop();
		}

		public static void main(String[] args) {

			MultiThread obj = new MultiThread();
//			obj.myLoop();
			obj.start();
			MultiThread obj2 = new MultiThread();
//			obj2.myLoop();
			obj2.start();

		}
}
