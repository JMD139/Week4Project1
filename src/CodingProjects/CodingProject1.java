package CodingProjects;

public class CodingProject1 {
//	1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//
//	a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
	public static void main(String[] args) {
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		int difference = ages[ages.length - 1] - ages[0];
		System.out.println(difference);
//	b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
//
//	i. Make sure that there are 9 elements of type int in this new array.  
//	ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		int[] ages2 = { 4, 15, 28, 59, 62, 8, 36, 81, 100 };
		int differences = ages2[ages2.length - 1] - ages2[0];
		System.out.println(differences);
//	c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for (int age : ages2) {
			sum += age;
		}
		double average = (double) sum / ages2.length;

		System.out.printf("The average age is: %.2g%n", average);
//	2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//		
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
//	a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
			double averageLetters = (double) totalLetters / names.length;
			System.out.printf("The average number of letters per name is: %.2f%n", averageLetters);
		}
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.		
		StringBuilder concatenatedNames = new StringBuilder();
		for (String name1 : names) {
			concatenatedNames.append(name1).append("  ");

			concatenatedNames.deleteCharAt(concatenatedNames.length() - 1);
			System.out.println("Concatenated names: " + concatenatedNames.toString());

		}
//	3. How do you access the last element of any array?
//
//	4. How do you access the first element of any array?		
		String firstElement = names[0];
		String lastElement = names[names.length - 1];
		System.out.println("First Element: " + firstElement);
		System.out.println("Last Element:" + lastElement);

//	5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.	

		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}

		System.out.println("Name Lengths: ");
		for (int length : nameLengths) {
			System.out.println(length + " ");
		}
//	6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.	

		int additon = 0;
		for (int length : nameLengths) {
			sum += length;
		}

		System.out.println("Sum of name lengths: " + sum);
//	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

		String word = "Hello";
		int n = 3;
		String concatenatedWord = concatenateWord(word, n);
		System.out.println("Concatenated word: " + concatenatedWord);

	}

	private static String concatenateWord(String word, int n) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			result.append(word);

		}
		return result.toString();
		
	}
}
