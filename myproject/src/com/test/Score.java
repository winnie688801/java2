package com.test;

public class Score {
	int value;
	public Score(String s) throws ScoreFormatException{
		try {
			value = Integer.parseInt(s);
			if (value<0 || value>100) {
				throw new ScoreFormatException();
			}
		} catch (NumberFormatException e) {
			throw new ScoreFormatException();
		}
		
	}
}
