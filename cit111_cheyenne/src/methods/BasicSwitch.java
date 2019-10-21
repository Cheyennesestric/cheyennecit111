package methods;

/**
 *
 * @author Cheyenne Sestric
 */
public class BasicSwitch {
    public static void main(String[] args){
        final int SELECTOR = 23;
        if(SELECTOR == 1){
                System.out.println("First case selected");
            
        }else if(SELECTOR == 23){
                System.out.println("Twenty-thrid case selected");
            
        }else if(SELECTOR == 78){
            
                System.out.println("Seventy-eighth case selected");
        }else{
            System.out.println("Default case");
        }//close if else
    }//close main block
    
}//close class
