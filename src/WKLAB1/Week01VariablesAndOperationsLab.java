//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package WKLAB1;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		System.out.println("Week 1 Lab");

		// 1. Create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 25;	
		
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 32.89;

		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'M';

	
		// 4. Create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = true;
		

		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Omar";

		
		// 6. Create a variable to hold a street address
		String streetAddress = "99 NW Packer Ave";
		

		// 7. Print all variables to the console
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println(costOfGroceries + " is the price for groceries.");
		System.out.println("My middle initial is " + middleInitial);
		System.out.println("It is hot outside - " + isHotOutside);
		System.out.println("The customer's first name is " + customerFirstName);
		System.out.println(streetAddress + " is where my best friend lives");
	

		// 8. A customer booked 2 plane seats, remove 2 seats from the available seats variable
		//availablePlaneSeats = availablePlaneSeats - 2;
		availablePlaneSeats -=2;
		System.out.println(availablePlaneSeats);
	
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total 
		//costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);


		// 10.  The birth certificate was printed incorrectly,change the middle initial to something else 
		middleInitial = 'J';
		System.out.println(middleInitial);

		// 11.  The season has changed, update the hot outside variable to be opposite of what it was
		//isHotOutside = !isHotOutside; This is another way to get the opposite of true or false.
		isHotOutside = false;
		System.out.println(isHotOutside);


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String customersLastName = "Brown";
		String customersFullName = customerFirstName + " " + middleInitial + " " + customersLastName;
		
		System.out.println(customersFullName);
		
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Hello all, this is " + customersFullName + " and they live at " + streetAddress + ".");

		
	}
}