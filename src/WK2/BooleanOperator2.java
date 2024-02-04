package WK2;

public class BooleanOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ageRequiredToDrive = 16;
		int currentAge = 14;
		boolean canPersonDrive = (currentAge >= ageRequiredToDrive);
		System.out.println(canPersonDrive);
		
		String name = "Janaya";
		
		if (name == "Janaya") {
			System.out.println("Hey sister");
		} else {
			System.out.println("You are not Janaya, " + name + "." );
		}
		
		int age = 15;
		
		if (age >= 16) {
			System.out.println("You can get your drivers license.");
		} else {
			System.out.println("Please wait " + (16 - age) + " year(s) to get your license.");
		}
		
		double costOfMilk = 4;
		
		if (costOfMilk <= 2) {
			System.out.println("Buying 2");
		} else if (costOfMilk <= 3) {
			System.out.println("Buying 1");
		} else {
			System.out.println("Not buying any Milk");
		}
		
		char grade = 'D';
		
		switch (grade) {
		case 'A':
			System.out.println("90%");
			break;
		case 'B':
			System.out.println("80%");
			break;
		case 'C':
			System.out.println("70%");
			break;
		case 'D':
			System.out.println("60%");
			break;
		default:
			System.out.println("0%");
		}
		
		if (5 == 5) {
			if (4 == 4) {
				System.out.println("Yes");
			}
		}
		
		if (5 == 5 && 4 == 4) {
			System.out.println("Yes");
		}
		
		
	}

}
