package cse360assign3;

public class Calculator 
{
	
	private int total;
	private String hist; 
	
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		hist = "0";
	}
	
	/** Displays the total 
	 * @return 		returns the value of total
	 */
	public int getTotal ()
	{
		return total; // returns the value of total
	}
	
	/** Insert unique integer 
	 *  @param value	integer added to total
	 */
	public void add (int value) 
	{
		total = total + value; // adds value to total
		hist = hist  + " + " + value;
	}
	
	/** Insert unique integer 
	 *  @param value	integer subtracted from total
	 */
	public void subtract (int value) 
	{
		total = total - value; // subtracts value from total
		hist = hist  + " - " + value;
	}
	
	/** Insert unique integer 
	 *  @param value	integer multiplied to total
	 */
	public void multiply (int value) 
	{
		total = total * value; // multiplies value to total
		hist = hist  + " * " + value;
	}
	
	/** Insert unique integer 
	 *  @param value	integer divided by total
	 */
	public void divide (int value) 
	{
		if (value == 0) // if value is 0 set total to 0
		total = 0;
		else
		total = total / value; // adds value to total
		hist = hist  + " / " + value;
	}
	
	/** Displays the string 
	 * @return 		returns string of the integers with operators
	 */
	public String getHistory () 
	{
		return hist; // returns string from all methods
	}

}
