/**
 * <p>
 * Test class to test out Calculator.java
 * </p>
 *
 * @author Calvin McClure
 * @param Main
 */

package cse360assign2;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator ();
		
		calc.add(5);
		calc.subtract(3);
		calc.divide(0);
		calc.add(1);
		calc.multiply(10);
		System.out.println(calc.getTotal());
		System.out.println(calc.getHistory());
	}

}
