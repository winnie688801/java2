package com.rainy;

public class BrushTeeth implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Brush your teeth");
			Thread.sleep(600);
			System.out.println("finish brush your teeth");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
