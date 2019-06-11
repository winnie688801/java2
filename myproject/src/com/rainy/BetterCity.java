package com.rainy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BetterCity {

	public static void main(String[] args) {
		List<City> cities = new ArrayList<>();
		try {
			BufferedReader bf = new BufferedReader(new FileReader("aaaa.txt"));
			String line = bf.readLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
