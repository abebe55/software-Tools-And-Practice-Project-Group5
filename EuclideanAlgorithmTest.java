package toolsAssignment;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuclideanAlgorithmTest {
    @Test
    public void testGcd() {
        assertEquals(14, EuclideanAlgorithmTest.gcd(42, 56));
        assertEquals(1, EuclideanAlgorithmTest.gcd(17, 31));
    
    }
}
