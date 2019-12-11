package objects;

/**
 *
 * @author cheyenne.sestric
 */
public class DonutLand {
    public static void main(String [] args){
        
        Donut donut1 = new Donut();
        
        donut1.name = "Chocolate";
        donut1.diameterMM = 4.8;
        donut1.percentRemaining = 100;
        donut1.calories = 70;
        donut1.displayDonutStatus();
        
        Donut donut2 = new Donut();
        
        donut2.name = "Powdered";
        donut2.diameterMM = 4.5;
        donut2.percentRemaining = 100;
        donut2.calories = 55;
        donut2.displayDonutStatus();
        
        Donut donut3 = new Donut();
        
        donut3.name = "Cinnamon";
        donut3.diameterMM = 4.3;
        donut3.percentRemaining = 100;
        donut3.calories = 55;
        donut3.displayDonutStatus();
        
        donut1.eatDonut(30);
        donut1.eatDonut(40);
        donut1.eatDonut(30);
        
    }
    
}
