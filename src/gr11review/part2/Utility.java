package gr11review.part2;

public class Utility {

    /**
     * EXAMPLE 1
     * 
     * Returns the total length of the given string.
     *
     * @param str the input string
     * @return the length of the string in characters
     * @author D. Cheng
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
    

}
