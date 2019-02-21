/**
 * <p>
 * functions like a calculator. Add subtract multiply divide functions available. 
 * The total can be displayed. history is recorded and can be displayed.
 * </p>
 *
 * @author Calvin McClure
 * @param Calculator 
 * @return getTotal  returns the total after operations
 * @return getHistory returns the history string of calculations done
 */

package cse360assign2;

public class Calculator {

	private int total;
	private String history = "0";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		history += " + " + Integer.toString(value);
	}
	
	public void subtract (int value) {
		total -= value;
		history += " - " + Integer.toString(value);
	}
	
	public void multiply (int value) {
		total *= value;
		history += " * " + Integer.toString(value);
	}
	
	public void divide (int value) {
		if(value == 0){
			total = 0;
		} else {
			total /= (int)value;
		}
		
		history += " / " + Integer.toString(value);
	}
	
	public String getHistory () {
		return history;
	}
}
