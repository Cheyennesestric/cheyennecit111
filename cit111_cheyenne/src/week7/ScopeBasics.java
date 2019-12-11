package week7;

/**
 *
 * @author cheyenne.sestric
 */
public class ScopeBasics {
    public static String localScopel = "I'm local to main.";
    public static String localScope2 = "I'm local to demonstrateScope";

    private static String classScopedVar = "All methods can see me!";

    
public static void demonstrateScope() {
    System.out.println("inside demonstrateScope");
    String localScope2 = "I'm local to demonstrateScope";
    System.out.println(localScope2);
    classScopedVar = "I can be changed in any method";
    
    }
public static void main(String[] args){
    System.out.println("Inside main");
  
    System.out.println(localScopel);
    System.out.println(classScopedVar);
    System.out.println(localScope2);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
           
}
}
