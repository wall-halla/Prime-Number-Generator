/**
 * 
 */
package prime_number_calculator;

/**
 * @author Walls
 *
 */
public class Prime {
	private int primeStartNum;
	private int primeStartValue;
	private int numPrimesToCalculate;

	Prime(int primeStartNum, int primeStartValue, int numPrimesToCalculate) {
		this.primeStartNum = primeStartNum;
		this.primeStartValue = primeStartValue;
		this.numPrimesToCalculate = numPrimesToCalculate;
	}

	public boolean isPrime(int number) {
		if (number % 2 == 0)
			return false;
		else {
			for (int index = 3; index < number; index +=2) { 
				if (number % index == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public void startPrimeCalculations() {
		for (int number = primeStartValue; numPrimesToCalculate >= 0; number++) {
			if (isPrime(number)) {
				printPrime(primeStartNum, number);
				primeStartNum++;
				numPrimesToCalculate--;
			}
		}
	}

	public void printPrime(int primeNumber, int primeValue) {
		System.out.println(primeNumber + " " + primeValue);
	}

	public int getPrimeStartNum() {
		return primeStartNum;
	}

	public int getPrimeStartValue() {
		return primeStartValue;
	}

	public int getNumPrimesToCalculate() {
		return numPrimesToCalculate;
	}
}
