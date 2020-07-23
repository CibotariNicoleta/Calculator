package Calculator;

public class Calculator {

	private final String delimiter = ",|\n";
	
	public int calculate (String input ) throws Exception{
		String[] numbers = input.split(delimiter);
		if(isEmpty(input)) {
			return 0;
		}
		if(input.length() == 1) {
			return stringToInt(input);
		}
		else {
			return getSum(numbers);
		}
		
		
	}


	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	

	private int getSum(String[] numbers) throws Exception{
		int sum = 0;
		for (String current:numbers) {
			if(stringToInt(current)<0)
				throw new Exception("Negative input");
			else if(stringToInt(current)>1000)
				continue;
			else sum+=stringToInt(current);
		}
		return sum;
	}

	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}
	
	
}
