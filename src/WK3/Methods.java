package WK3;

public class Methods {

	public static void main(String[] args) {
		String firstName = "Kiki";
		String lastName = "James";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);

	}
	
	public static String createFullName(String x, String y) {
		return x + " " + y;
		
		
	}

}
