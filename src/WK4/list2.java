package WK4;

import java.util.ArrayList;
import java.util.List;

public class list2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myInstruments = new ArrayList<String>();
		myInstruments.add("Tuba");
		myInstruments.add("Trombone");
		myInstruments.add("Trumpet");
		myInstruments.add("Triangle");

//		System.out.println(myInstruments);

		myInstruments.add("Flute");
		myInstruments.add("Clarinet");
		myInstruments.add("Oboe");

//		System.out.println(myInstruments);

		myInstruments.add("Piano");
		myInstruments.add("Chloe");
		myInstruments.add("Guitar");
		myInstruments.remove(1);

//		System.out.println(myInstruments);

		for (int i = 0; i < myInstruments.size(); i++) {
			System.out.println(myInstruments.get(i));
		}

		for (String myInsturment : myInstruments) {
			System.out.println(myInstruments);
		}

	}

}
