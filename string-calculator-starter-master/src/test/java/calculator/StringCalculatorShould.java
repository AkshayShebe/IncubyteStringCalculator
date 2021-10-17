package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() throws NumberFormatException, NegativeNumberNotallowedExcep {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }
    
    @Test
    void single_string_should_return_0()  throws NumberFormatException, NegativeNumberNotallowedExcep{
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    void string_with_two_number_should_return_number_as_sum()  throws NumberFormatException, NegativeNumberNotallowedExcep {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }
    
    @Test
    void string_with_multiple_number_should_return_number_as_sum()  throws NumberFormatException, NegativeNumberNotallowedExcep {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(10, stringCalculator.add("1,2,3,4"));
    }
     @Test
    void method_to_handle_multiple_between_numbers()  throws NumberFormatException, NegativeNumberNotallowedExcep {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(5, stringCalculator.add("1\n4"));
    }
     @Test
     void support_delimiter_seperate_line()  throws NumberFormatException, NegativeNumberNotallowedExcep {
         StringCalculator stringCalculator = new StringCalculator();
         assertEquals(3, stringCalculator.add("//;\n1;2"));
     }
     @Test
     void string_with_negative_number_should_throw_error()  throws NumberFormatException, NegativeNumberNotallowedExcep  {
         StringCalculator stringCalculator = new StringCalculator();
         assertEquals(3, stringCalculator.add("//;\n-1;-2"));
     }
     @Test
     void string_with_number_greater_than_1000() throws NumberFormatException, NegativeNumberNotallowedExcep {
         StringCalculator stringCalculator = new StringCalculator();
         assertEquals(2, stringCalculator.add("2+1001"));
     }
    }
    

