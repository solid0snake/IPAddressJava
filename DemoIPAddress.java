/* DemoIPAddress.java
 * @author Pedro Garate
 * Task: Tests IPAddress.java
 */

import java.util.Arrays;

public class DemoIPAddress
{
	public static void main (String args[])
	{
		IPAddress a = new IPAddress();
		long startTime, endTime;
		int totalNum = 10;
		int testNum = 5;
		
		// Testing gen
		String[] string = a.gen(totalNum);
		a.println("Array generated by gen:");
        a.println(Arrays.toString(string));
        a.println("\nFirst "+testNum+" elements:");
        a.head(string, testNum);
        a.println("\nLast "+testNum+" elements:");
		a.tail(string, testNum);
		a.sort(string);
		a.println("\nArray sorted:");
		a.println(Arrays.toString(string));
		
		// Testing ugen
		String[] string1 = a.ugen(totalNum);
		a.println("\n\nArray generated by ugen:");
        a.println(Arrays.toString(string1));
        a.println("\nFirst "+testNum+" elements:");
        a.head(string1, testNum);
        a.println("\nLast "+testNum+" elements:");
		a.tail(string1, testNum);
		a.sort(string1);
		a.println("\nArray sorted:");
		a.println(Arrays.toString(string1));
		
		// Performance times
		startTime = System.nanoTime();
        string = a.gen(100000);
		endTime = System.nanoTime();
		a.println("\n\ngen took "+(endTime-startTime)*1E-6+" ms");
		a.println("to generate 100000 IP addresses.");
		
		startTime = System.nanoTime();
        string = a.ugen(100000);
		endTime = System.nanoTime();
		a.println("\nugen took "+(endTime-startTime)*1E-6+" ms");
		a.println("to generate 100000 IP addresses.");
		
		startTime = System.nanoTime();
        a.sort(string);
		endTime = System.nanoTime();
		a.println("\nIt took "+(endTime-startTime)*1E-6+" ms");
		a.println("to sort 100000 IP addresses.");
	}
}
