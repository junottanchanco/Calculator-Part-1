//Create the Calculator bean that will allow for the user to set operands and operations, 
//then perform them and get the results.

//Have logic for adding and subtracting.

public class Calculator {
	private double operandOne;
	private double operandTwo;
	private double result;
	private String operation;
	
	//getter
	public double getOperandOne() {
		return operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	
	//setter
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
//	Have logic for adding and subtracting.
	public void performOperation() {
		if(operation.equals("+")) {
			result = this.operandOne + this.operandTwo;
		}else if(operation.equals("-")) {
			result = this.operandOne - this.operandTwo;
		}else {
			System.out.println("Operation is not available");
			result = 0;
		}
	}
	public double getResults() {
		return result;
	}
}
