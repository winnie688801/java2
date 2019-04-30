package com.bear;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListFreq {

	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> l = new ArrayList<>();
		for (int i=0; i<20; i++) {
			l.add(0);
		
		}
		for (int i=0; i<10000; i++) {
			int num = r.nextInt(20);
			int freq = l.get(num);
			l.set(num, freq+1);
			System.out.print(num);
		}
		System.out.println(l);
		
	}

}
