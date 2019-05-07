package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {

	public static void main(String[] args) {
//		int n = Integer.parseInt("00");
//		try {
//			FileReader fr = new FileReader("www.txt");
//			System.out.println("Success!");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		File file = new File("www.txt");
//		System.out.println(file.exists());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
//		System.out.println(file.getName());
//		System.out.println(file.canRead());
//		System.out.println(file.getUsableSpace());
//		System.out.println(file.getTotalSpace());
//		System.out.println(file.length());
		
		File f = new File("C:\\SWSetup\\SP72518");
		if (f.exists() && f.isDirectory()) {
			File[] files =  f.listFiles();
			for (File fl : files) {
				if(fl.isFile()) {
				System.out.println(fl.getName());
				}
			}
			System.out.println(f.mkdir());
			File add = new File(f, "www");
			//在f裡面新增一個叫www的資料夾
			System.out.println(add.mkdirs());
			for (int i=0;i<=2000000;i++) {
				System.out.println("3");
			}
			System.out.println(add.delete());
		}
	}
}
