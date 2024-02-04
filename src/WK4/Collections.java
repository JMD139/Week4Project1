package WK4;

import java.util.HashSet;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> vegetables = new HashSet<String>();

		vegetables.add("Carrot");
		System.out.println(vegetables);
		vegetables.add("Onion");
		System.out.println(vegetables);
		vegetables.add("Broccoli");
		System.out.println(vegetables);
		vegetables.add("Asparagus");
		System.out.println(vegetables);
		vegetables.add("Carrot");
		System.out.println(vegetables);
		vegetables.add("null");
		System.out.println(vegetables);
		vegetables.add("null");
		System.out.println(vegetables);
		System.out.println("The size of out set is: " + vegetables.size());

	}

}
