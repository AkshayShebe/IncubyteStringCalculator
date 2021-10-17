package calculator;

class StringCalculator {

    // The method can take up to two numbers, separated by commas, and will return their sum. 
	
	public int add(String input) {
		
		String[] numbers = input.split(",");
		
    	if(input == null || input.isEmpty()) {
    		return 0;
    	} 
    	
	    else if(input.length() == 1) {
    		return Integer.parseInt(input);
    	}  
    	else {
    		
    		return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
    	}

    }
}