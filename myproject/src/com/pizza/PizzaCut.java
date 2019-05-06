package com.pizza;

import java.util.Scanner;

public class PizzaCut {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try{
			System.out.println("How many pieces do you want to cut?");
			Pizza cut = new Pizza(scan.nextLine());
			if (cut.value == 0) {
				System.out.println("Do you sure you don't need to cut?");
				Scanner s = new Scanner(System.in);
				String line = s.nextLine();
				boolean yes = line.toUpperCase().equals("Y");
				if (yes) {
					System.out.println("Thanks for your buying!");
				} else {
					System.out.println("Please enter the number again.");
				}
			} else if (cut.value>=1 && cut.value<=7 || cut.value>=9 && cut.value<=11 || cut.value>=13 && cut.value<=15) {
				System.err.println("Wrong number!");
			} else if (cut.value==8 || cut.value==12 || cut.value==16) {
				System.out.println("Thanks for your buying!");
			} 
		} catch (PizzaCutFormatException e) {
			System.err.println(e.getMessage());
	}
}
}