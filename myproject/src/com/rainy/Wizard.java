package com.rainy;

public class Wizard extends Thread{

		public void thunder() {
			System.out.println("Thunder start");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thunder end");

	}

	@Override
	public void run() {
		thunder();
	}

		
	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		w1.start();
		try {
			w1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Wizard w2 = new Wizard();
		w2.start();
	}
}