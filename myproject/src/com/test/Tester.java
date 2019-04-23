package com.test;

import java.util.Random;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int avg = 0;
		Random r = new Random();
		int lottery = r.nextInt(300000)+1;
		Scanner scan =  new Scanner(System.in);
		System.out.println(lottery);
		System.out.print("How many people attend this game?");
		String s = scan.nextLine();
		try {
			int num = Integer.parseInt(s);
			avg = lottery/num;
			System.out.println("The average prize is " + avg + " dollars.");
		} catch (ArithmeticException e) {
			System.out.println("Please enter a none-zero number.");
		} catch (NumberFormatException e) {
			System.out.println("Please enter a number.");
		} 
//			catch (Exception e) {
//			System.out.println("Please enter the right data.");
//		}
	}
}
