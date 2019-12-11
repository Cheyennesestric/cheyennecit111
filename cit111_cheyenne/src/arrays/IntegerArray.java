package arrays;

/**
 *
 * @author cheyenne.sestric
 */
public class IntegerArray {
    public static void main(String[] args){
        int[] writingInstruments = new int[5];
        
        writingInstruments[0] = 22;
        writingInstruments[1] = 8;
        writingInstruments[2] = 31;
        writingInstruments[3] = 13;
        writingInstruments[4] = 19;
        
        printArrayContents(writingInstruments);
        loopPrintArrayContents(writingInstruments);
        
        
    }
    
    public static void printArrayContents(int[] args){
        System.out.println("Amount of writing instruments in first"
                + " cup: " + args[0]);
        System.out.println("Amount of writing instruments in second"
                + " cup: " + args[1]);
        System.out.println("Amount of writing instruments in third"
                + " cup: " + args[2]);
        System.out.println("Amount of writing instruments in fourth"
                + " cup: " + args[3]);
        System.out.println("Amount of writing instruments in fifth"
                + " cup: " + args[4]);

        
    }
    public static void loopPrintArrayContents(int[] args){
        int amountSize = args.length;
        int counter = 0;
        while(counter < args.length){
            System.out.println("Value of array index: " + counter + " is "
             + args[counter]);
            counter = counter + 1;
            
        }
        System.out.println("Array size: " + amountSize);
        
    }
    public static void totalWritingInstruments(int[] args){
        for(int counter = 0; counter < args.length; counter++){
            
        }
    }
}
