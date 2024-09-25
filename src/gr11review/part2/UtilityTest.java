package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UtilityTest{

    /**
     * EXAMPLE 3
     * 
     * Tests for toUpperCase() method.
     * @author J. Doe
     */
    @Test
    public void toUpperCase_givenExamples_returnsCorrect() {
        // Given examples
        assertEquals("DAVID", Utility.toUpperCase("david"));
        assertEquals("PASSWORD123", Utility.toUpperCase("password123"));
    }

  
}
