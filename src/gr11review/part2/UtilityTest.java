package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UtilityTest{

    /**
     * EXAMPLE 1
     * 
     * Unit tests for getStringLength() method.
     * @author D. Cheng
     */
    @Test
    public void getStringLength_givenExamples_returnsCorrect() {
        assertEquals(13, Utility.getStringLength("Hello, World!"));
        assertEquals(6, Utility.getStringLength("Hello!"));
        assertEquals(5, Utility.getStringLength("Hello"));
    }

    @Test
    public void getStringLength_emptyString_shouldReturn0() {
        assertEquals(0, Utility.getStringLength(""));
    }

    @Test
    public void getStringLength_nullString_shouldReturn0() {
        assertEquals(0, Utility.getStringLength(null));
    }

    @Test
    public void getStringLength_singleChar_shouldReturn1() {
        assertEquals(1, Utility.getStringLength("A"));
    }

    @Test
    public void getStringLength_allSpaces_shouldReturn5() {
        assertEquals(5, Utility.getStringLength("     "));
    }

    
    /**
     * EXAMPLE 3
     * 
     * Tests for toUpperCase() method.
     * @author J. Doe
     */
    @Test
    public void testToUpperCase_givenExamples_returnsCorrect() {
        // Given examples
        assertEquals("DAVID", Utility.toUpperCase("david"));
        assertEquals("PASSWORD123", Utility.toUpperCase("password123"));
    }

    @Test
    public void testToUpperCase_givenBlank_returnsBlank() {
        // Blank string
        assertEquals("", Utility.toUpperCase(""));
    }
  
    @Test
    public void testToUpperCase_givenNoLetters_returnsSame() {
        // String, but no letters
        assertEquals("12345678", Utility.toUpperCase("12345678"));
    }
  
    @Test
    public void testToUpperCase_specialChars_returnsCorrect() {
        // String, but no letters
        assertEquals("TH1$_$H0ULD_W0RK", Utility.toUpperCase("th1$_$h0uld_w0rk"));
    }
  


}
