package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }
    
    @Test
    void single_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    void string_with_two_number_should_return_number_as_sum()  {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }
    
    @Test
    void string_with_multiple_number_should_return_number_as_sum()  {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(10, stringCalculator.add("1,2,3,4"));
    }
     @Test
    void method_to_handle_multiple_between_numbers()  {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(5, stringCalculator.add("1\n4"));
    }
     @Test
     void support_delimiter_seperate_line()  {
         StringCalculator stringCalculator = new StringCalculator();
         assertEquals(3, stringCalculator.add("//;\n1;2"));
     }
    }
    

