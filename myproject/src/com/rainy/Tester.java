package com.rainy;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Hello!");
		Breakfast bk = new Breakfast();
		bk.start();
		
		try {
			bk.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		BrushTeeth bt = new BrushTeeth();
		Thread th = new Thread(bt);
		th.start();
		
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Eat breakfast");
		
	}

}
