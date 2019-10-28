package week7;

/**
 *
 * @author cheyenne.sestric
 */
public class ReturnSandbox {

    public static void main(String[] triumvriate) {
        String chopMe = "is";
//        String chopMe = "The atomic number of zinc is 30";
        String output = chopCharactersFromString(chopMe);
        System.out.println("Test chopped is: " + output);

    }

    public static String chopCharactersFromString(String strToChop) {

        String chopped;
        int inputStringLength = strToChop.length();
        if (inputStringLength < 4) {
            return "Too Short";
        }
        chopped = strToChop.substring(2, inputStringLength);

        return chopped;
    }
}
