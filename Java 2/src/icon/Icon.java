package icon;

/**
 * Class models a 10X10 grid whose cells can be colored or non-colored to
 * represent an icon related to student interest
 *
 * @author Cheyenne Sestric
 */
public class Icon  {
    

    
        //a member varible to store an arry of booleans
        int[] firstLine;
        //Constructor
        // called when the Object is created
    
    public Icon() {
        //Fill in member variables with appropriate values
        firstLine = null;

    }

    public Icon(int[] intArray) {
        System.out.println("Inside constructor taking in array");
        firstLine = intArray;

    }
    //Methods

    public String displayIcon() {
        StringBuilder ab = new StringBuilder();
        ab.append("Data analutics student project feedback");
        ab.append(" \n");
        ab.append("Icon, personality, and art");
        
    

        return ab.toString();

    }//close displayIcon

    /**
     * method that takes in a scaling factor used by displayIcon Takes in a
     * scale factor interpreted as: means print only one character for each cell
     * turned "on" in the array. (Default)
     *
     * Example: [ [00110], [11001] ]
     *
     * Normal scaling would be like this:
     *
     * @@
     * @@ @
     *
     * If we set scaling factor to 3, out would be as follows
     *
     * @@@@@@
     * @@@@@@
     * @@@@@@
     * @@@@@@ @@@
     * @@@@@@ @@@
     * @@@@@@ @@@
     */
    public void scaleIcon(int scaleFactor) {

    

}
}//close main
