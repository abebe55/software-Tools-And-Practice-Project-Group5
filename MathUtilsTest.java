package kproject

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    public void testGcd() {
        assertEquals(14, MathUtils.gcd(42, 56));
        assertEquals(1, MathUtils.gcd(17, 31));
    }
}
