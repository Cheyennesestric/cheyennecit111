package icon;

/**
 * Class models a 10X10 grid whose cells can be colored or non-colored to
 * represent an icon related to student interest
 *
 * @author Cheyenne Sestric
 */
public class Icon {

    int[][] iconMatrix = null;


    public Icon() {

        int[][] matrix = {
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 0, 0, 0, 1, 1, 1},
            {1, 0, 0, 0, 0, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 1, 1, 1, 1, 1},
            {1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
            {0, 1, 0, 1, 1, 0, 1, 1, 1, 0},
            {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0}

        };

        iconMatrix = matrix;

    }

    public void printIcon() {
        for (int row = 0; row < iconMatrix.length; row++) {
            for (int column = 0; column < iconMatrix[row].length; column++) {
                if (iconMatrix[row][column] == 1){
                    System.out.print("@");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        System.out.print("\n");
        /**
         * method that takes in a scaling factor used by displayIcon Takes in a
         * scale factor interpreted as: means print only one character for each
         * cell turned "on" in the array. (Default)
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
    }//close main
}