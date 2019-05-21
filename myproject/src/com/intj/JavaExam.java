package com.intj;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaExam {

	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			FileWriter fw = new FileWriter("result.txt");
			pw = new PrintWriter(fw);
			pw.println("嗨");
			pw.write("JAVA 熊若妤");
			pw.write(74);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
