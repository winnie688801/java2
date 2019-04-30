package com.test;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Please enter your English score:");
			Score english = new Score(scan.nextLine());
			System.out.println("Please enter your Math score:");
			Score math = new Score(scan.nextLine());
			System.out.println((english.value+math.value)/2);
		} catch (ScoreFormatException e) {
			System.out.println("Wrong format!");
			System.out.println(e.getMessage());
		}
	}

}
