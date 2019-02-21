/**
 * not sure what this class does yet.
 *
 * @author Calvin McClure
 * @param Calculator 
 * @return getTotal  returns the total int
 * @return getHistory returns the history string
 */

package cse360assign2;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
	}
	
	public void subtract (int value) {
		total -= value;
	}
	
	public void multiply (int value) {
		total *= value;
	}
	
	public void divide (int value) {
		if(value == 0){
			total = 0;
		} else {
			total /= (int)value;
		}
	}
	
	public String getHistory () {
		return "";
	}
}
