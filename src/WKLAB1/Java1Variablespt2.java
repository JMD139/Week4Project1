package WKLAB1;

public class Java1Variablespt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Given a method called swapNumbers, that takes in two parameters named x and
		 * y, write a program that swaps the values of the variables. For example, if x
		 * = 3 and y = 5 then after the swap, x will be 5 and y will be 3. Use variables
		 * to store the integer values. You may not reassign the variables by writing x
		 * = 5 or y = 3. When the program runs, the following should print to the
		 * console: "After swapping, x is equal to 5 and y is equal to 3."
		 * 
		 */
	    int x = 3;
	    int y = 5;
		int temporary = x;
        x = y;
        y = temporary;
        System.out.println("After swapping, x is equal to " + x + " and y is equal to " + y + ".");
		
        /*
         * Given of type double called radius.
In the body of the method declare a constant of type double named PI equal to 3.14159
Then declare a variable called area
Set area equal to an equation that will calculate the area of a circle using PI and the radius parameter
Note: Calculation of the area of a circle is (pi * r * r)
, also don't use parentheses as they are not necessary.
Radius can be 5.0 or 12.75 or 2
         */
        
        
        double radius = 5;
        final double PI = 3.14159;
        double area = PI * radius * radius;
        System.out.println(area);
	}

}
