import java.util.LinkedList;
import java.util.ListIterator;
/**
 *
 * @author cheyenne sestric
 */
public class ListsPrac {
    public static void main(String[] args){
        useArrays();
        useCollections();
    }
    
    public static void useArrays(){
      String[] candleScentNames = {"Watermelon Lemonade",
                                 "Mahogany Teakwood",
                                 "Rose Water & Ivy",
                                 "Butterscotch Toffee",
                                 "Peach Bellini"};  
        System.out.println("Array Implementations");
        //display size:
        System.out.println("Size of array: " + candleScentNames.length);
        System.out.println("Third item: " + candleScentNames[2]);
        System.err.println("Last item: " + 
                candleScentNames[candleScentNames.length - 1]);
        printArrayContents(candleScentNames);
        System.out.println("Trying to remove Peach Bellini");
        candleScentNames[4] = null;
        printArrayContents(candleScentNames);
        
        
    }
    
    private static void printArrayContents(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            
        }
        
    }
    
    public static void useCollections(){
        LinkedList<String> candleList = new LinkedList<>();
        candleList.add("Watermelon Lemonade");
        candleList.add("Mahogany Teakwood");
        candleList.add("Rose Water & Ivy");
        candleList.add("Butterscotch Toffee");
        candleList.add("Peach Bellini");
        System.out.println("************");
        System.out.println("Collections implentation");
        System.out.println("List Lenth: " + candleList.size());
        System.out.println("Third item: " + candleList.get(2));
        System.out.println("Last item: "  + candleList.getLast());
        printListContents(candleList);
        candleList.remove();
        System.out.println("Removed first item");
        printListContents(candleList);
        candleList.remove("Peach Bellini");
        System.out.println("Removed peach bellini");
        printListContents(candleList);
        
    }
    
    private static void printListContents(LinkedList<String> lst){
        //extract an iterator from the List
        ListIterator iter = lst.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
    }
}
