package calculator;

class StringCalculator {

    // The method can take up to two numbers, separated by commas, and will return their sum. 
	
	public int add(String input) {
		
		
		
    	if(input == null || input.isEmpty()) {
    		return 0;
    	} 
    	
	    else if(input.length() == 1) {
    		return Integer.parseInt(input);
    	}  
    	
	else
	{
		int sum=0;
		String[] numbers = input.split(",");
		

		for(int i = 0 ; i<numbers.length;i++) {
			int num = Integer.parseInt(numbers[i]);
			sum=sum+num;
		}

		return sum;
	}
	}}
	
	
