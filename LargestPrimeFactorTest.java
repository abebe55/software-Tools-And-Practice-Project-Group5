package toolsAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPrimeFactorTest {

    @Test
    public void testLargestPrimeFactor() {
    	LargestPrimeFactor check = new LargestPrimeFactor();
    	long assign= 13;
    	long checker=check.largestPrimeFactor(234);
    	
        assertEquals(assign,checker);
        
    }
}
