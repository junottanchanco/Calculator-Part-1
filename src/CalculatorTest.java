import java.util.*;
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		c.setOperandOne(5.123456789);
		c.setOperation("+");
		c.setOperandTwo(8);	
		c.performOperation();
		double result = c.getResults();
		System.out.println(Math.round(result));
	}

}
