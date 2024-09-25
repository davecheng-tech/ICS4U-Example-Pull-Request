package gr11review.part2;

public class Utility {

    /**
     * EXAMPLE 1
     * 
     * Returns the total length of the given string.
     *
     * @param str the input string
     * @return the length of the string in characters
     * @author J. Doe
     */
    public static int getStringLength(String str) {
        if (str == null) {
            return 0; // Return 0 if the string is null
        }
        return str.length();
    }
   

    /**
     * EXAMPLE 3
     * 
     * Reserved for future use.
     * 
     * @param str
     * @return 
     * @author D. Cheng
     */
    public static String converUpper(String str) {
        return str;
    }


    /**
     * EXAMPLE 4
     * 
     * Converts a given string to lowercase.
     *
     * @param str the input string
     * @return the string in uppercase
     * @author J. Doe
     */
    public static String toLowerCase(String str) {
        if (str == null) {
            return null; // Handle null input
        }
        return str.toLowerCase();
    }    
    

    /**
     * EXAMPLE 5
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
