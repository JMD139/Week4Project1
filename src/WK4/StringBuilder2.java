package WK4;

public class StringBuilder2 {

	public static void main(String[] args) {
		String firstName = "Bob";
		String lastName = "Brown";
		System.out.println(firstName + " " + lastName);

		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);

		System.out.println(firstName.concat(lastName));
		firstName = firstName.concat(lastName);
		System.out.println(firstName);

		StringBuilder fullName = new StringBuilder("Bob");
		fullName.append(" Davis");
		System.out.println(fullName.toString());

		System.out.println(fullName.charAt(5));
//		System.out.println(fullName.deleteCharAt(5));
//		System.out.println(fullName.delete(1, 3));
		System.out.println(fullName.indexOf("vi"));
		System.out.println(fullName.replace(4, 9, "Thompson"));
		System.out.println(fullName.reverse());

	}

	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}

}
