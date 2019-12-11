package arrays;

/**
 *
 * @author cheyenne.sestric
 */
public class ArrayPractice {
    public static void main(String[] args){
        
        String[] books = new String[5];
        books[0] = "Perl Cookbook";
        books[1] = "PHP Cookbook";
        books[2] = "Python in a Nutshell";
        books[3] = "JavaScript The Definitve Guide";
        books[4] = "Java in a Nutshell";
        printArrayContents(books);
        loopPrintArraycontents(books);
        forLoopPrintArrayContents(books);
    }
    public static void printArrayContents(String[] arr){
        System.out.println("Value of book 1: " + arr[0]);
        System.out.println("Value of book 2: " + arr[1]);
        System.out.println("Value of book 3: " + arr[2]);
        System.out.println("Value of book 4: " + arr[3]);
        System.out.println("Value of book 5: " + arr[4]);
        
        
    }
    public static void loopPrintArraycontents(String[] arr){
        int arraySize = arr.length;
        int counter = 0;
        while(counter < arraySize){
            System.out.println("Value of array index: " + counter + " is "  + 
                     arr[counter]);
            counter = counter + 1;
        }
        System.out.println("Array size passed in: " + arraySize);
    }
    public static void forLoopPrintArrayContents(String[] arr){
        for(int counter = 0; counter < arr.length ; counter++){
            System.out.println("Value of array index " + counter + " is " 
            + arr[counter]);
        }
    }
            
}
