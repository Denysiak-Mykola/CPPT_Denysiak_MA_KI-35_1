/**
 * Lab 5
 */
package КІ305.Денисяк.Lab5;

import java.io.*;
import java.util.*;

/**
 * Fio class implements my equation according to the variant tan(x)/ctg(x).
 * If we simplify the equation tan(x)/ctg(x), we can get the equation tan^2(x).
 * Because it's easier to calculate, so I'll use the equation tan^2(x).
 * Also implements read and write methods in text and binary formats.
 */
public class Fio {
	/**
	 * Method returns result of equation tan^2(x)
	 * @param <code>x</code> Variable x
	 */
	public double calc(double x) {
		double rad = x * Math.PI / 180.0;
		if (Math.round(Math.cos(rad) * Math.pow(10, 10)) / Math.pow(10, 10) == 0) {
			throw new IllegalArgumentException("Invalid x value: tangent undefined");
		}
		
		return Math.pow(Math.tan(rad), 2);
	}
	
	/**
	 * Method write data in text file
	 * @param <code>f</code> text file
	 * @param <code>x</code> argument x 
	 */
	
	public void WriteTxt(PrintWriter f, double x) throws FileNotFoundException
	{
		f.printf("%f ",x);
		f.close();
	}
	
	/**
	 * Method read data from text file
	 * @param <code>f</code> text file
	 * @param <code>s</code> scanner
	 * @param <code>x</code> argument x 
	 */
	
	public void ReadTxt(File f, Scanner s, double x)
	{
		try
		{
			if (f.exists())
			{
				s = new Scanner(f);
				x = s.nextDouble();
				s.close();
			}
			else
				throw new FileNotFoundException("File " + f.getName() + "not found");
		}
		catch (FileNotFoundException ex)
		{
			System.out.print(ex.getMessage());
		}
	}
	
	/**
	 * Method write data in bin file
	 * @param <code>f</code> text file
	 * @param <code>x</code> argument x 
	 */
	
	public void WriteBin(DataOutputStream f, double x) throws FileNotFoundException, IOException
	{
		f.writeDouble(x);
		f.close();
	}
	
	/**
	 * Method read data from bin file
	 * @param <code>f</code> text file
	 * @param <code>x</code> argument x 
	 */
	
	public void ReadBin(DataInputStream f, double x) throws FileNotFoundException, IOException
	{
		x = f.readDouble();
		f.close();
	}

}