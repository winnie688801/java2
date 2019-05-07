package com.pizza;

public class Pizza {
	int value;
	
	public Pizza(String piece) throws PizzaCutFormatException {
		try {
			value = Integer.parseInt(piece);
			if (value<0 || value>15) {
				throw new PizzaCutFormatException();
			}
		} catch (NumberFormatException e) {
			throw new PizzaCutFormatException();
		}
		}
	public void print() {
		System.out.println("Thanks for your buying!");
	}
	
	public void printWrong() {
		System.err.print("Wrong number!");
	}
	
	public void printAgain() {
		System.out.println("Please enter the number again.");
	}
	

}
