/**
 * 
 */
package prime_number_calculator;
import java.util.Date;
/**
 * @author Walls
 *
 */
public class Logic {
	public static void main(String args[]) {
		Date startTime = new Date();
		//Prime prime = new Prime(500000, 7368787, 1000); took ~14.456 seconds to run at home
		//Prime prime = new Prime(2, 3, 50000); took ~29.76 seconds to run at home (and ~28.693 without the console output)
		Prime prime = new Prime(2, 3, 50000);
		prime.startPrimeCalculations();
		Date endTime = new Date();
		long timeTaken = (endTime.getTime()-startTime.getTime());
		long miliseconds = timeTaken % 1000;
		long seconds = timeTaken / 1000;
		System.out.println("The program took " + seconds + "." + miliseconds + " seconds to run.");
	}
}
