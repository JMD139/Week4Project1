package WK3;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] students = new String[3];
//		
//		students[0] = "Jawan Brown";
//		students[1] = "Mark Jones";
//		students[2] = "Nat Williams";
//		
//		
//		System.out.println(students [0]);
//		System.out.println(students [1]);
//		System.out.println(students [2]);
//		
//		
//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i]);
//		}
//		
//		System.out.println("Enhanced for loops: ");
//		
//		for (String student : students) {
//			System.out.println(student);
//		}

		String firstName = "Mary";
		String lastName = "Brown";
		int assignmentOne = 100;
		int assignmentTwo = 79;
		int assignmentThree = 80;
		int assignmentFour = 90;
		int assignmentFive = 100;
		int assignmentSix = 89;

//		System.out.println("Student: " + firstName + " " + lastName);
//		System.out.println("Grades:");
//		System.out.println("1: " + assignmentOne);
//		System.out.println("2: " + assignmentTwo);
//		System.out.println("3: " + assignmentThree);
//		System.out.println("4: " + assignmentFour);
//		System.out.println("5: " + assignmentFive);

		String fullName = "Mary" + " " + "Brown";
		int[] gradeArray = { 100, 79, 80, 90, 100, 89, 77, 92, 102 };
		int counter = 1;

		System.out.println("Student: " + fullName);
		System.out.println("Grades: ");
		for (int i = 0; i < 9; i++) {
			System.out.println((i + 1) + ": " + gradeArray[i]);
		}

		String[] products = new String[5];

		products[0] = "Carrots";
		products[1] = "Strawberrries";
		products[2] = "Sweet Potatoes";
		products[3] = "Oranges";
		products[4] = "Greens";

		for (String product : products) {
			System.out.println("Product: " + product);
		}

		int[] multiplesof3 = new int[10];

		for (int i = 1; i <= multiplesof3.length; i++) {
			multiplesof3[i - 1] = i * 3;
			System.out.println("number: " + multiplesof3[i - 1]);
		}

		int[] multiplesof5 = new int[10];

		for (int i = 0; i < multiplesof5.length; i++) {
			multiplesof5[i] = (i + 1) * 5;
			System.out.println(multiplesof5[i]);

		}

	}

}
