package WK2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = SC.nextLine();
		
		System.out.println("Welcome, " + name);
		
		System.out.print("Please enter your age: ");
		String Age = SC.nextLine();
		
		System.out.println("You are, " + Age + " year's old");
		
		int selection = 0;
		double total = 0;
		
		while (selection != 4) {
		System.out.println("Select an option.");
		System.out.println("1) add candybar to shopping cart: 1.99");
		System.out.println("2) add cheese to shopping cart: 6.95");
		System.out.println("3) add soccer ball to shopping cart: 12.99");
		System.out.println("4) check out");
			
		selection = SC.nextInt();
		
		
		switch (selection) {
			case 1:
				total += 1.99;
				break;
			case 2:
				total += 6.95;
				break;
			case 3:
				total =+ 12.99;
				break;
			case 4:
				break;
			default:
				System.out.println("Please pick a valid option. ");
		}				
	}
		
		
	System.out.println("Your current total is: " + total);	
}
}