package week5_loopingshapes;

import java.util.Scanner;

/**
 *
 * @author Cheyenne Sestric
 */
public class LoopingRectangles {

    public static void main(String[] args) {
        int rowCount;
        int rowPosition = 0;
        int heightCount;
        int heightPosition = 0;
        String symbol;
        Scanner keyboardReader = new Scanner(System.in);

        System.out.println("Type any symbol to create a block!");
        System.out.println("Symbol: ");
        symbol = keyboardReader.next();
        System.out.println("Also adjust the height and width of your block!");
        System.out.println("Height: ");
        rowCount = keyboardReader.nextInt();
        System.out.println("Height: " + rowCount);
        while (rowCount < 0) {
            if (rowCount < 0) {
                System.out.println("ERROR");
                System.out.println("Try again...");
            } else {
                System.out.println();
            }
        }


        System.out.println("Width: ");
        heightCount = keyboardReader.nextInt();
        System.out.println("Width: " + heightCount);

        while (heightCount < 0) {
            if (heightCount < 0) {
                System.out.println("ERROR");
                System.out.println("Try again...");
            } else {
                System.out.println("***PRINTING***");
            }
        }

        //controlling left-right position
        while (heightPosition < heightCount) {
            while (rowPosition < rowCount) {
                System.out.print(symbol);
                rowPosition = rowPosition + 1;
            }
            System.out.println();

            heightPosition = heightPosition + 1;
            rowPosition = 0;

        }//end while
    }//close main

}//close class
