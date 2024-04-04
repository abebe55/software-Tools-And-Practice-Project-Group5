package toolsAssignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalNumberReversalTest {

    @Test
    public void testReverseDecimalNumber() {
        assertEquals(653.91, DecimalNumberReversal.reverseDecimalNumber(193.56));
        assertEquals(876.54321, DecimalNumberReversal.reverseDecimalNumber(123.45678));
        assertEquals(8.764, DecimalNumberReversal.reverseDecimalNumber(4.678));
    }

}
