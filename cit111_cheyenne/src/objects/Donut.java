/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author cheyenne.sestric
 */
public class Donut {
    public double diameterMM;
    public int calories;
    public int percentRemaining;
    public String name;
    
    
    
    public int eatDonut(int percentEaten){
        percentRemaining = percentRemaining - percentEaten;
        return percentRemaining;
        
    }
    public void displayDonutStatus(){
        System.out.println("*****************DONUT STATUS****************");
        System.out.println("Name:" + this.name);
        System.out.println("Percent remaining: " + this.percentRemaining);
        System.out.println("Calories: " + this.calories);
        System.out.println("Diameter(in mm): " + this.diameterMM);
        System.out.println("*********************************************");
    }
}
