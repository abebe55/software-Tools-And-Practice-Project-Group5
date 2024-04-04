package toolsAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPrimeFactorTest{
	
   
    @Test
    public void test() {
        LargestPrimeFactor tool = new LargestPrimeFactor();
        int expectedPF = 109;
        int actualPF = tool.largestPrimeFactor(654);
         assertEquals (expectedPF,actualPF);
    }
}
