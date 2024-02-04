package WKLAB1;

public class OpenClassWK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *You have been given two variables, num1 and num2, each with 		   	     *predefined values as test cases. Your task is to calculate the       		 *sum of these variables and display the result using the 		  		 *System.out.println();
		 */
		
		int num1 = 10;
		int num2 = 2;
		System.out.println(num1 + num2);
		
		/*
		 * The variables, firstName and lastName, have been provided to 		 	       you in the code
		 * editor. Create a variable called fullName. Then, set the   		  		   fullName variable
		 * equal to the concatenation of the two variables with a space 		 		   in between.
		 */
		
		String firstName = "Ollie";
		String lastName = "Jones";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		System.out.println(fullName == firstName + lastName);
		
		
	}

}
