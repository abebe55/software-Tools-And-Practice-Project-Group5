import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testFindLargestElement {
    
    @Test
    void testFindLargest() {
        int[] arr = {5, 10, 3, 8, 2};
        int expectedLargest = 10;
        int actualLargest = LargestElement.findLargest(arr);
        assertEquals(expectedLargest, actualLargest);
    }
    
    @Test
    void testFindLargest_EmptyArray() {
        int[] arr = {};
        try {
            LargestElement.findLargest(arr);
        } catch (IllegalArgumentException e) {
            assertEquals("Array must not be empty or null", e.getMessage());
        }
    }
}