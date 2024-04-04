package toolsAssignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EuclideanAlgorithmTest {
	 @Test
	    public void testEuclideanAlgorithm() {
		 EuclideanAlgorithm tools = new EuclideanAlgorithm();
	        int expectedEA = 1;
	        int actualEA = tools.euclideanAlgorithm(13, 45);
	        
	        assertEquals(expectedEA,actualEA);
	    }

}
