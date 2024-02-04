package CodingProjects;

public class CodingProject1cont {

	public static void main(String[] args) {
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).			
		String firstName = "John";
		String lastName = "Doe";
		String fullName = generateFullName(firstName, lastName);
		System.out.println("Full Name: " + fullName);
//9.  Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.		
		int[] myArray = { 10, 20, 30, 50 };
		boolean result = isSumGreaterThan100(myArray);
		System.out.println("Is the sum greater than 100? " + result);
//10. Write a method that takes an array of double and returns the average of all the elements in the array.       
		double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
		double average = calculateAverage(numArray);
		System.out.format("The average is: %.2f%n", average);
//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.       
		double[] array1 = { 10.5, 20.3, 15.8, 18.2 };
		double[] array2 = { 30.7, 25.6, 22.4, 28.9 };

		boolean result1 = comapareAverages(array1, array2);
		System.out.println("Is the average of array1 greater than array2? " + result1);
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.       
		boolean hotOutside = true; // Example: It's hot outside
		double moneyInPocket = 15.75; // Example: Money in pocket

		boolean shouldBuyDrink = willBuyDrink(hotOutside, moneyInPocket);
		System.out.println("Should buy a drink? " + shouldBuyDrink);
//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.       
		int[] testScores = { 85, 92, 78, 95, 88 };
		double averageScore = calculateAverage(testScores);
		System.out.printf("Average test score: %.2f%n", averageScore);

	}

// This is apart of question 8.
	public static String generateFullName(String firstName, String lastName) {
		return firstName + " " + lastName;

	}

// This is apart of question 9.   
	public static boolean isSumGreaterThan100(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum > 100;

	}

// This is apart of question 10.
	public static double calculateAverage(double[] arr) {
		double sum = 0.0;
		for (double num : arr) {
			sum += num;
		}

		return sum / arr.length;

	}

// This is apart of question 11.
	public static boolean comapareAverages(double[] arr1, double[] arr2) {
		double sum1 = 0.0;
		double sum2 = 0.0;

		for (double num : arr1) {
			sum1 += num;
		}
		for (double num : arr2) {
			sum2 += num;
		}

		double average1 = sum1 / arr1.length;
		double average2 = sum2 / arr2.length;

		return average1 > average2;
	}

// This is apart of question 12.   
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {

		return isHotOutside && moneyInPocket > 10.50;
	}

//  This is apart of question 13.   
	public static double calculateAverage(int[] scores) {
		if (scores.length == 0) {
			return 0.0;
		}

		int sum = 0;
		for (int score : scores) {
			sum += score;
		}

		return (double) sum / scores.length;

//    	The calculateAverage method takes an array of test scores (scores) as an argument.
//    	It calculates the sum of all test scores.
//    	The average is obtained by dividing the sum by the total number of test scores.
//    	The main method demonstrates how to use the calculateAverage method.
	}

}
