package objects;

/**
 *Client class to car
 * Contain the main method 
 * @author cheyenne.sestric
 */
public class CarLand {
    public static void main(String[] args){
        //create a variable of our custom type car
        Car firstCar;
        //use new to instantiate our Car class
        //and store a reference in firstCar
        firstCar = new Car();
        firstCar.make = "Hyundai";
        firstCar.model = "Santa Fe";
        firstCar.year = 2006;
        firstCar.color = "Silver";
        firstCar.mpg = 19;
        System.out.println("My firstCar object engine status: "
                + firstCar.checkEngineStatus());
        firstCar.startEngine();
        System.out.println("My firstCar object engine status: "
                + firstCar.checkEngineStatus());
        //reading from member variables and writing to console
        System.out.println("My firstCar model is " + firstCar.model);
        
        Car toyCar = new Car();
        toyCar.make = "Ford";
        toyCar.model = "Hot Rod";
        toyCar.year = 1934;
        toyCar.color = "Orange";
        toyCar.mpg = 13;
        
        double avgYear = (firstCar.year + toyCar.year) / 2;
        System.out.println("Average year: " + avgYear);
        
        toyCar.startEngine();
        toyCar.accelerate(60);
        System.out.println("Car speed: " + toyCar.checkSpeed());
        toyCar.decelerate(70);
        System.out.println("Car speed: " + toyCar.checkSpeed());
        toyCar.stopEngine();
        
        
        
         
        
    }//close main
    
}//close class
