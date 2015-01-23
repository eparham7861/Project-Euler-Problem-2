package ecp.prj;

public class FibonacciCalculator {
	
	private int previous, current, tempPrevious, sum;
	public int getSum(int total) {
		sum = 0;
		previous = 1;
		current = 1;
		
		for (int i = 0; i < total; i++) {
			if (isEven(current)) {
				if (isGreaterThanTotal(total)) {
					break;
				}
				else {
					sum += current;
				}
			}
			increaseFibonacci();
		}
		return sum;
	}
	
	private boolean isEven(int currentNumber) {
		if (currentNumber % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean isGreaterThanTotal(int total) {
		if (sum > total) {
			return true;
		}
		else {
			return false;
		}
	}
	private void increaseFibonacci() {
		tempPrevious = current;
			
		current = current + previous;
		
		previous = tempPrevious;
	}
}