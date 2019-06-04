package com.rainy;

public class Breakfast extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Making breakfast");
			Thread.sleep(600);
			System.out.println("finish making breakfast");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
