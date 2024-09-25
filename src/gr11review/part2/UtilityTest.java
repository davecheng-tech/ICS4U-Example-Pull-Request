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
        assertEquals(0, Utility.getStringLength(""), "Length of an empty string should be 0");
    }

    @Test
    public void getStringLength_nullString_shouldReturn0() {
        assertEquals(0, Utility.getStringLength(null), "Length of a null string should be 0");
    }

    @Test
    public void getStringLength_singleChar_shouldReturn1() {
        assertEquals(1, Utility.getStringLength("A"), "Length of a single character string should be 1");
    }

    @Test
    public void getStringLength_allSpaces_shouldReturn5() {
        assertEquals(5, Utility.getStringLength("     "), "Length should be 5 for a string with 5 spaces");
    }

}
