package com.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Work {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("work.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			while (s != null) {
				System.out.println(s);
				String[] worktimes = s.split(",");
				if(worktimes.length == 2) {
					System.out.println(worktimes[0] + "/" + worktimes[1]);
					int i = Integer.parseInt(worktimes[1]);
				}
				s = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
