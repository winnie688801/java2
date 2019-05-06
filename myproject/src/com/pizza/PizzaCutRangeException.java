package com.pizza;

public class PizzaCutRangeException extends Exception{

	@Override
	public String getMessage() {
		return "Out of the range!";
	}
	

}
