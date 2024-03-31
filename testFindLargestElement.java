package toolsAssignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testFindLargestElement {

    @Test
    public void testFindLargestElement() {
        LargestElementFinder finder = new LargestElementFinder();
        int[] arr = {3, 7, 1, 9, 5};
        assertEquals(9, finder.findLargestElement(arr));
    }
}
