package week7;
import java.util.Scanner;
/**
 *
 * @author Cheyenne Sestric 
 */
public class GeometricShapes {
    
    public static void main(String[] args){
        
        Scanner keyboardReader = new Scanner(System.in);
        
        double response;
        double responseCyl;
        double responsePrismLength;
        double responsePrismHeight;
        double responsePrismWidth;
        double responseHeptaSide;
        double responseHeptaHeight;
        
        
        System.out.println("Enter the side length of the cube to calculate "
                + "its volume: ");
        response = keyboardReader.nextDouble();
        double returnedVolume = calcVolumeOfCube(response);
        System.out.println("Volume of a cube with side length "
                + response + " is: " + returnedVolume);
        
        
        System.out.println("Enter the radius of the cylinder to calculate its "
                + "volume: ");
        response = keyboardReader.nextDouble();
        System.out.println("Enter the height of the cylnder to calculate its"
                + " volume: ");
        responseCyl = keyboardReader.nextDouble();
        returnedVolume = calcVolumeOfCylinder(response, responseCyl);
        System.out.println("Volume of a cylinder with a " + response +" height"
                + " and a " + responseCyl + " radius is: " + returnedVolume);
        
        
        System.out.println("Enter the length of the rectangular prism to "
                + "calculate its volume: ");
        responsePrismLength = keyboardReader.nextDouble();
        System.out.println("Enter the height of the rectangular prism to "
                + "calculate its volume: ");
        responsePrismHeight = keyboardReader.nextDouble();
        System.out.println("Enter the width of the rectangular prism to"
                + "calculate its volume: ");
        responsePrismWidth = keyboardReader.nextDouble();
        returnedVolume = calcVolumeOfRecPrism(responsePrismLength, 
                responsePrismHeight, responsePrismWidth);
        System.out.println("Volume of a rectangular prism with a " + 
                responsePrismLength + " length, " + responsePrismHeight + 
                " height, and a " + responsePrismWidth + " width is: " 
                + returnedVolume);
        
        
        System.out.println("Enter the side length of the heptagon to "
                + "calculate its volume: ");
        responseHeptaSide = keyboardReader.nextDouble();
        System.out.println("Enter the height of the heptagon to calulate "
                + "its volume: ");
        responseHeptaHeight = keyboardReader.nextDouble();
        returnedVolume = calcVolumeOfHeptagon(responseHeptaSide, 
                responseHeptaHeight);
        System.out.println("Volume of a heptagon with a " + responseHeptaSide
         + " side length and " + responseHeptaHeight + " height is: "
                 + returnedVolume);
    }
    
    public static double calcVolumeOfCube(double sideLength){
        double cubeVolume = Math.pow(sideLength, 3);
       
        return cubeVolume;
    }
    
    
    public static double calcVolumeOfCylinder(double radius, double height){
        final double PI = 3.1416;
        double cylVol = PI * (radius * radius) * height;
        
        return cylVol;
    }
    
    public static double calcVolumeOfRecPrism(double length, double height, 
            double width){
        double recPrismVolume = length * height * width;
        
        return recPrismVolume;
    }
    
    public static double calcVolumeOfHeptagon(double side, double height){
        final double PI = 3.1416;
        
        double heptagonVolume = (7 / 4) * Math.pow(side, 2) * (Math.cos(PI / 7)
                * (PI / 7) / Math.sin(PI / 7)) * height;
        
        return heptagonVolume;
        
    }
    
   
}
