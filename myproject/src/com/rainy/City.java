package com.rainy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class City {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		ArrayList<String> areas = new ArrayList<>();
		ArrayList<String> postCodes = new ArrayList<>();
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader("aaaa.txt"));
			String line = bf.readLine();
			String last = "";
			while (line != null) {
				System.out.println(line);
				String[] tokens = line.split(",");
				if (!last.equals(tokens[0])) {
					last = tokens[0];
					cities.add(last);
				}
				areas.add(tokens[1]);
				postCodes.add(tokens[2]);
				line = bf.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(cities);
		
	}

}
