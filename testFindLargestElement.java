package toolsAssignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import toolsAssignment.LargestElement;

public class LargestElementTest {
	@Test
    public void testFindLargestElement() {
		LargestElement tool = new LargestElement();
        int[] arr = {1, 2, 3, 4, 5, 200, 87, 56, 924, 92654, 2876, 987};
        int expectedLE = 92654;
        int actualLE= tool.findLargestElement(arr);
        assertEquals(expectedLE, actualLE);
    }

}
