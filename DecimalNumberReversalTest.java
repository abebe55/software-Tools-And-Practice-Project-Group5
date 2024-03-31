package toolsAssignment;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecimalNumberReversalTest {

    @Test
    public void testReverseDecimalNumber() {
        DecimalNumberReversal decimalNumberReversal = new DecimalNumberReversal();
        assertEquals("65.391", decimalNumberReversal.reverseDecimalNumber(193.56));
    }

    @Test
    public void testReverseDecimalNumberWithZero() {
        DecimalNumberReversal decimalNumberReversal = new DecimalNumberReversal();
        assertEquals("0.0", decimalNumberReversal.reverseDecimalNumber(0.0));
    }

    @Test
    public void testReverseDecimalNumberWithNegative() {
        DecimalNumberReversal decimalNumberReversal = new DecimalNumberReversal();
        assertEquals("65.391-", decimalNumberReversal.reverseDecimalNumber(-193.56));
    }
}
