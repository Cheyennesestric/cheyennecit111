package methods;
import java.math.BigInteger;
import java.util.Random;
/**
 *
 * @author Cheyenne Sestric
 */
public class SimpleMethod {
    public static void printStatement(){
        System.out.println("************INSIDE printStatement*************");
        System.out.println("Statement: Where There's a Will, There's a Way");
        System.out.println("**********************************************");
        generateBigNumber();
                
    }// close method printSpecialStatement
    public static void main(String[] args){
        
        System.out.println("This code is inside method: main");
        //call method printStatement, transferring execution to that block
        printStatement();
        //call the same method again!
        System.out.println("...back in main");
        generateBigNumber();
        System.out.println("...back in main");
        
        printStatement();
    }// close method main
    //create method called generateBigNumber()
    public static void generateBigNumber(){
        System.out.println("INSIDE generateBigNumber");
    
        Random r = new Random();
        BigInteger bigInt = new BigInteger(100, r);
        System.out.println(bigInt);
        System.out.println("LEAVING generateBigNumber");
        
    }//close genterateBigNumber
    
}//close class
