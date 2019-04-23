package com.test;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int math = 0;
		int english = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your math score:");
		try {
			String ms = scan.nextLine();
			math = Integer.parseInt(ms);
		} catch (ArithmeticException e) {
			System.out.println("The score should be 0~100.");
		} catch (NumberFormatException e) {
			System.out.println("The format is wrong.");
		}
		
		System.out.print("Please enter your english score:");
		try {
			String es = scan.nextLine();
			english = Integer.parseInt(es);
		} catch (ArithmeticException e) {
			System.out.println("The score should be 0~100.");
		} catch (NumberFormatException e) {
			System.out.println("The format is wrong.");
		}
		
		int average = (math+english)/2;
		System.out.println("Your average is " +average + ".");
	}

}
