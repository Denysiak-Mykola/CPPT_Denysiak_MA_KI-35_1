/**
 * lab4
 */
package КІ305.Денисяк.Lab4;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * The EquationApp class driver is designed to validate and test the Equation class
 */
public class EquationApp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Equation eq = new Equation();
		
		try {
			System.out.println("Enter x: ");
			double x = scanner.nextDouble();
			
			double res = eq.calc(x);
			System.out.println("Result: " + res);
			
			FileWriter writer = new FileWriter("res.txt");
			writer.write("Result: " + res);
			writer.close();
		}catch (IllegalArgumentException e){
			System.err.println("Error: " + e.getMessage());
		}catch (IOException e) {
			System.err.println("Error writing to a file: " + e.getMessage());
		}finally {
			scanner.close();
			System.out.println("End");
		}
	}

}
