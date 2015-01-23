package ecp.prj;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class FibonacciCalculatorTest {

	private FibonacciCalculator calculator;
	
	@Before
	public void startUp() {
		calculator = new FibonacciCalculator();
	}
	
	@Test
	public void testGetSumOfEvensBelowFourMillion() {
		assertEquals(4613732, calculator.getSum(4000000));
	}
}