package com.rainy;

public class Horse extends Thread{
	public Horse(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for (int i=1; i<=100; i++) {
			StringBuilder space = new StringBuilder();
			for (int j=0; j<i; j++) {
				space.append(" ");
			}
			System.out.println(getName() + space.toString() + i);
//			try {
//				sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
	

}
