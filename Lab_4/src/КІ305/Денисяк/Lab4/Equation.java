/**
 * lab4
 */
package КІ305.Денисяк.Lab4;

/**
 * Equation class implements my equation according to the variant tan(x)/ctg(x).
 * If we simplify the equation tan(x)/ctg(x), we can get the equation tan^2(x).
 * Because it's easier to calculate, so I'll use the equation tan^2(x).
 */
public class Equation {

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

}