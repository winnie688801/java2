package com.bear;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Freq {

	public static void main(String[] args) {
		Map<Integer, Integer> m = new HashMap<>();
		Random r = new Random();
		for (int i=0; i<10000; i++) {
			int num = r.nextInt(20);
			Integer freq = m.get(num);
			if (freq == null) {
				m.put(num, 1);
			}
			else {
				m.put(num, freq+1);
			}
		}
		System.out.println(m);
	}
}