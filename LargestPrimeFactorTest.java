package toolsAssignment;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LargestPrimeFactorTest {

    @Test
    public void testCalculateLargestPrimeFactor() {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
        assertEquals(29, largestPrimeFactor.calculateLargestPrimeFactor(13195));
    }

    @Test
    public void testCalculateLargestPrimeFactorWithLargeNumber() {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
        assertEquals(6857, largestPrimeFactor.calculateLargestPrimeFactor(600851475143L));
    }

    @Test
    public void testCalculateLargestPrimeFactorWithPrimeNumber() {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
        assertEquals(17, largestPrimeFactor.calculateLargestPrimeFactor(17));
    }
}

