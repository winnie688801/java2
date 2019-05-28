package com.rainy;

public class Main {

	public static void main(String[] args) {
		Horse h1 = new Horse("horse1 ");
		Horse h2 = new Horse("horse2 ");
		Horse h3 = new Horse("horse3 ");
		h1.start();
		h2.start();
		h3.start();
		
//		HorseRunnable h1 = new HorseRunnable();
//		Thread th = new Thread(h1);
//		th.start();
//		for (int i=1; i<=1000; i++) {
//			System.out.println("horse1 " + i);
//		}
//		
//		for (int n=1; n<=10000; n++) {
//			System.out.println("horse2 " + n);
//		}
		
		System.out.println("End");
	}

}
