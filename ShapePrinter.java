package printing;

/**
 *Blueprint class for basic printing methods
 * @author cheyenne.sestric
 */
public class ShapePrinter {
    public final String PRINTCHAR = "&";
    /**
     * Prints to console a square of characters
     * of an inputted side length.
     * Example: printBox(3) would result in<br>
     * &&&<br>
     * &&&<br>
     * &&&<br>
     * 
     * @param sideLength 
     */
    public void printBox(int sideLength){
        System.out.println("Inside printBox, printing box of sideLength" +
                  sideLength);
        //use for loop to make a row of size sideLength
        for(int i = 0;i < sideLength ; i++ ){
            System.out.print(PRINTCHAR);
            for(int j = 0;j < sideLength ; j++){
                System.out.print(PRINTCHAR);
                
            }
            System.out.print("\n");
        }//close for
        
    }
    
    
}
