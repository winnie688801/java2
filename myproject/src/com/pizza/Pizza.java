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
	
	

}
