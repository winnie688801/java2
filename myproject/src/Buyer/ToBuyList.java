package Buyer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ToBuyList {

	public static void main(String[] args) {
		String product;
		int quantity;
		List<Item>l =  new ArrayList<>();	
		while (true) {
			System.out.print("Enter 1 to add, enter 2 to print:");
			Scanner s = new Scanner(System.in);
			int c = s.nextInt();
			
			if (c==1) {
				System.out.print("Please enter the product:");
				product = s.nextLine();
				s.nextLine();
				System.out.print("Please enter the quantity:");
				quantity = s.nextInt();
				l.add(new Item(product, quantity));
			}
			if (c==2) {
				for (Item i:l) {
				System.out.println(i.product);
				}
			}
			else if (c!=1&&c!=2) {
				break;
			}
		}
	}
}
