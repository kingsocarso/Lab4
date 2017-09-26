/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * Finds the string which is in common between the two parameter strings.
 */
public class ReclamationProject {
    /**
     * Method to find substrings in common between a and b.
     * @param a The first input string which will be searched for common substrings with b.
     * @param b Second input string which will be searched for common substrings with a.
     * @return The resultant common substrings.
     */
    static String doit(final String a, final String b) {
        String newA = a, newB = b;
        if (a.length() > b.length()) {
            String c = a;
            newA = b;
            newB = c;
        }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < newA.length(); i++) {
            for (int j = newA.length() - i; j > 0; j--) {
                for (int k = 0; k < newB.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    }
                }
            }
        } return r; }
}
