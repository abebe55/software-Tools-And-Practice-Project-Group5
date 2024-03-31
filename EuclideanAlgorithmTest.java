package toolsAssignment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EuclideanAlgorithmTest {

    @Test
    public void testFindGCD() {
        EuclideanAlgorithm euclideanAlgorithm = new EuclideanAlgorithm();
        assertEquals(6, euclideanAlgorithm.findGCD(30, 18));
    }

    @Test
    public void testFindGCDWithZero() {
        EuclideanAlgorithm euclideanAlgorithm = new EuclideanAlgorithm();
        assertEquals(5, euclideanAlgorithm.findGCD(0, 5));
        assertEquals(5, euclideanAlgorithm.findGCD(5, 0));
    }

    @Test
    public void testFindGCDWithNegativeNumbers() {
        EuclideanAlgorithm euclideanAlgorithm = new EuclideanAlgorithm();
        assertEquals(-4, euclideanAlgorithm.findGCD(-12, 20));
    }
}
