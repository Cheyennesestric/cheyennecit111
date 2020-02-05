package printing;

/**
 * Blueprint class for basic printing methods
 *
 * @author cheyenne.sestric
 */
public class ShapePrinter {

    public final String PRINTCHAR = "&";

    /**
     * Prints to console a square of characters of an inputted side length.
     * Example: printBox(3) would result in<br>
     * &&&<br>
     * &&&<br>
     * &&&<br>
     *
     * @param sideLength
     */
    public void printBox(int sideLength) {
        System.out.println("Inside printBox, printing box of sideLength"
                + sideLength);
        //use for loop to make a row of size sideLength
        for (int i = 0; i < sideLength; i++) {
        }
            for (int j = 0; j < sideLength; j++) {
                System.out.print(PRINTCHAR);

            }//close inner for
            System.out.print("\n");
        }//close outer for

    public void printPyramid(int sideLength){
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print(PRINTCHAR);

            }//close inner for
            System.out.print("\n");
        
    }//close printBox
    }
        @Override
        public String toString(){
            return "Were are the nights who say ni!";
    }
}
