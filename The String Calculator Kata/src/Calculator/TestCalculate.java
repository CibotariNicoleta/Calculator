package Calculator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class TestCalculate {
    private  Calculator calculator;
    
	@Before
	public void setUp() {
		 calculator = new Calculator();
	}
	@Test
	public void emptyStringReturnsZero() throws Exception {
	     assertEquals(calculator.calculate(""), 0);
	}
	
	@Test
	public void singleValueIsReplied() throws Exception{
		assertEquals(calculator.calculate("1"), 1);
	}
	
	@Test
	public void twoNumbersCommaDelimitedReturnSum() throws Exception {
		assertEquals(calculator.calculate("2,3"), 5);
	}
	
	
	@Test
	public void twoNumbersNewLineDelimitedReturnSum() throws Exception{
		assertEquals(calculator.calculate("2\n3"),5);
	}
	
	@Test
	public void threeNumbersDelimitedBothWaysReturnSum() throws Exception{
		assertEquals(calculator.calculate("2,3,1"), 6);
	}
	
	@Test(expected=Exception.class)
	public void negativeInputReturnsException() throws Exception{
		calculator.calculate("-1");
		
	}
	
	@Test
	public void ignoresNumbersGreaterThan1000() throws Exception {
		assertEquals(calculator.calculate("10,10,1001"), 20);
	}
}
