package ls3_classStructure;

/**
 *
 * @author cheyenne.sestric
 */
public class KennywoodRideTracker {
    int totalRiders = 0;
    private static int totalFailedRideAttemps = 0;
    private static int totalSickRiders = 0;
    final static int MINHEIGHTTHRILL = 56;
    final static int MINHEIGHTTHEME = 48;
    int riders;
    int avgHeight;
    
    public static void main(String[] args){
        Random rand = new Random();
        int numLoops = 1000000;
        int counter = 0;
        while(counter < numLoops){
            double r = rand.nextGaussian();
            sum = sum +r;
            System.out.println(rand.nextGaussian());
            System.out.println(" ");
            counter++;
        }
    } 
    
    public static void rideBlackWidow(int riders, int avgHeight){
        
    }
    
    public static void rideMerryGoRound(int riders, int avgHeight){
        
    }
    
    public static void printRideStats(){
        
        
    }
    
    
    
}//close class

