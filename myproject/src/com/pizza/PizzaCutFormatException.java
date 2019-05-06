package com.pizza;

public class PizzaCutFormatException extends Exception{

	@Override
	public String getMessage() {
		return "Wrong Format or out of the range!!";
	}

}
