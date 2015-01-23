/* IPAddress.java
 * @author Pedro Garate
 * Task: Creates and implements a list of IP addresses (Strings)
 */

import java.util.ArrayList;

public class IPAddress
{
	private String ip;
	private ArrayList<String> ipList;
	private String[] ipArray;
	
	public IPAddress ()
	{
		int a = rand(0, 255);
		int b = rand(0, 255);
		int c = rand(0, 255);
		int d = rand(0, 255);
		
		ip = "" + a + "." + b + "." + c + "." + d;
	}
	
	/** Task: Gives an array of IP addresses.
     * @param integer n is the number of IP addresses in the
     *        array.
     * @return Array of Strings representing IP addresses.
     */
	//************************** gen ***************************
	public String[] gen (int n)
	{
		if (n < 1) die("Invalid number of elements.");
		
		ipList = new ArrayList<String>();
		
		for(int i=0; i<n; i++)
		{
			IPAddress addy = new IPAddress();
			ipList.add(addy.toString());
		}
		
		ipArray = ipList.toArray(new String[n]);
		return ipArray;
	}
	
	/** Task: Gives an array of unique IP addresses.
     * @param integer n is the number of IP addresses in the 
     *        array.
     * @return Array of Strings representing unique IP addresses
     */
	//************************** ugen **************************
	public String[] ugen (int n)
	{
		if (n < 1) die("Invalid number of elements.");
		
		ipList = new ArrayList<String>();
		IPAddress addy = new IPAddress();
		ipList.add(addy.toString());
		
		for(int i=0; i<n-1; i++)
		{
			addy = new IPAddress();
			if (ipList.contains(addy))
			    i--;
			else ipList.add(addy.toString());
		}
		
		ipArray = ipList.toArray(new String[n]);
		return ipArray;
	}
	
	/** Task: Shows the first n Strings of the IP addresses 
	 *        array.
     * @param s is the array worked on and n is the number of IP
     *        addresses will be retrieved.
     */
	//************************** head **************************
	public void head (String s[], int n)
	{
		if (n < 0 || n > s.length)
			die("Invalid number or not enough elements.");
		
		for(int i = 0; i < n; i++)
		{
			println(s[i]);
		}
	}
	
	/** Task: Shows the last n Strings of the IP addresses 
	 *        array.
     * @param s is the array worked on and n is the number of IP
     *        addresses will be retrieved.
     */
	//************************** tail **************************
	public void tail (String s[], int n)
	{
		if (n < 0 || n > s.length)
			die("Invalid number or not enough elements.");
		
		for (int i = s.length-n; i < s.length; i++)
		{
			println(s[i]);
		}
	}
	
	/** Task: Sorts the array of IP addresses.
     * @param s is the array worked on.
     * @return sorted array of Strings.
     */
	//************************** sort **************************
	public String[] sort (String s[])
	{
		String tmp;  
	    for(int i=0;i<s.length;i++)  
	    {
	    	for(int j=1;j<s.length-i;j++)
	    	{
	    		String[] instr1 = s[j-1].split("\\.");
	    		String[] instr2 = s[j].split("\\.");
	    		if(Integer.parseInt(instr1[0]) > Integer.parseInt(instr2[0])) 
	            {
	    			tmp=s[j-1];
	    			s[j-1]=s[j];
	    			s[j]=tmp;
	    		}else if(Integer.parseInt(instr1[0]) == Integer.parseInt(instr2[0])  
	                         && Integer.parseInt(instr1[1]) > Integer.parseInt(instr2[1]) )  
	            {
	    			tmp=s[j-1];
	    			s[j-1]=s[j];
	    			s[j]=tmp;
	    	    }else if(Integer.parseInt(instr1[0]) == Integer.parseInt(instr2[0])  
	                         && Integer.parseInt(instr1[1]) == Integer.parseInt(instr2[1])  
	                         && Integer.parseInt(instr1[2]) > Integer.parseInt(instr2[2]) )  
	            {
	    	    	tmp=s[j-1];
	    	    	s[j-1]=s[j];
	    	    	s[j]=tmp;
	    	    }else if(Integer.parseInt(instr1[0]) == Integer.parseInt(instr2[0])  
	                         && Integer.parseInt(instr1[1]) == Integer.parseInt(instr2[1])  
	                         && Integer.parseInt(instr1[2]) == Integer.parseInt(instr2[2])  
	                         && Integer.parseInt(instr1[3]) > Integer.parseInt(instr2[3]) )  
	            {
	    	    	tmp=s[j-1];
	    	    	s[j-1]=s[j];
	    	    	s[j]=tmp;
	    	    }  
	    	}  
	    }
		return s;
	}
	
	/** Task: Gives a random integer.
     * @param integers a and b are the boundaries for the random
     *        number that is being produced.
     * @return random integer.
     */
	//************************** rand **************************
	public static int rand (int a, int b)
    {
    	return((int)((b-a+1)*Math.random()+a));
    }
	
	/** Task: Kills the program.
     * @param msg is a string explaining why the program was 
     *        aborted.
     */
	//************************** die ***************************
	public static void die (String msg)
    {
    	System.err.println(msg);
    	System.exit(1);
    }

	/** Task: Gives the ip object as a string.
     * @return IP address as a string.
     */
	//************************** toString **********************
	public String toString ()
    {
    	return ip;
    }
	
	/** Task: Prints out the object.
     * @param object o is to be printed.
     */
	//************************* println ************************
	public void println (String o)
	{
		System.out.println(""+o);
	}
}
