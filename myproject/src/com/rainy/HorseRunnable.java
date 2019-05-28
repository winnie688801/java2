package com.rainy;

public class HorseRunnable implements Runnable{

	@Override
	public void run() {
		for (int i=1; i<=1000; i++) {
			System.out.println("horse1 " +i);
		}
		
	}
	
	
}
