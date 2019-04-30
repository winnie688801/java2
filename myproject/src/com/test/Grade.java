package com.test;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Please enter your math score:");
			String ms = scan.nextLine();
			int math = Integer.parseInt(ms);
			System.out.print("Please enter your english score:");
			String es = scan.nextLine();
			int english = Integer.parseInt(es);
			int average = (math+english)/2;
			System.out.println("Your average is " +average + ".");
		} catch (NumberFormatException e) {
			System.err.println("Please enter a number!");
//			e.printStackTrace(); 
		}
		
	}

}
