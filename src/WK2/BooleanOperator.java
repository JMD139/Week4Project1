package WK2;

public class BooleanOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2 == 2);
		System.out.println(2 == 3);
		System.out.println(2 > 5);
		System.out.println(2 < 5);
		System.out.println(3 <= 5);
		System.out.println(5 > 5);
		System.out.println(2 == 2 && 1 < 5);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(3 == 3 || 5 > 10);
		System.out.println(4 == 5 || 2 > 3);
		/*List of Boolean operators:

		Less than:   <
		Greater than:   >
		Less than or equal to:   <=
		Greater than or equal to:   >=
		Equal To (type matters):   ==
		Not Equal To (type matters):   !=
		 * 
		 */
		
		int car = 6;
		int ball = 5;
		int carBall = (car + ball);
		
		System.out.println(carBall);
	}

}
