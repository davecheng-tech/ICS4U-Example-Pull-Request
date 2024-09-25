package gr11review.part2;

public class Utility {

    /**
     * EXAMPLE 3
     * 
     * Converts a given string to uppercase.
     *
     * @param str the input string
     * @return the string in uppercase
     * @author J. Doe
     */
    public static String toUpperCase(String str) {
        if (str == null) {
            return null; // Handle null input
        }
        return str.toUpperCase();
    }    
    
}
