// chettraj
/*
 * First and Last Names
 */

import java.awt.Rectangle;

public class Homework1 {

	/* Fix the error(s) in this method so that it runs properly
	 */
	public static int problem1() {
		int mystery = 1;
		mystery = mystery + 1;
		mystery = 1 - 2 * mystery;
		
		return mystery;
	}

	/* Costruct and return a Rectangle that has a width of w and a
	 * height of h
	 */
	public static Rectangle problem2(int w, int h) {
		Rectangle wrekt;
		wrekt = new Rectangle(w, h);
		return wrekt;
	}

	/* Declare an integer, assign it a value of 5, then return it
	 */
	public static int problem3() {
		int o = 5;
		return o;
	}

	/* Declare and return a String containing the phrase "Computer Science"
	 */
	public static String problem4() {
		String str = "Computer Science";
		return str;

	}

	/* Add 5 to num and return the new value
	 */
	public static int problem5(int num) {
		num = num + 5;
		return num;
	}

}
