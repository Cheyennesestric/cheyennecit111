package objects;

/**
 *
 * @author cheyenne.sestric
 */
public class Car {

    public String make;
    public String model;
    public int year;
    public double mpg;
    public String color;
    //only methods in this class
    //can access private member varibles
    private boolean engineOn;
    private double speed;

    /**
     * Simulates starting this instance of Car's engine.
     */
    public void startEngine() {
        engineOn = true;
        System.out.println("...crank...sputter...vroom...");
    }

    public void stopEngine() {
        engineOn = false;
        System.out.println("...crank...*stall*");
    }

    /**
     * Getter method for retrieving engine status
     *
     * @return value of member variable engineOn
     */
    public boolean checkEngineStatus() {
        return engineOn;
    }

    public void accelerate(int s) {
        speed = speed + s;

    }

    public void decelerate(int d) {
        speed = speed - d;

    }

    public double checkSpeed() {
        if (speed < 0) {
            System.out.println("You are completely stopped");
            speed = 0;
        }
            return speed;

    }
}
