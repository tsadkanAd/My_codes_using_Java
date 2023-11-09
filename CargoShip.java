/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

/**
 *
 * @author TA
 */
public class CargoShip extends Ship{
    private int capacityTonnage;
    public CargoShip(){
    super();
    capacityTonnage = 0;
    }
    public CargoShip(String name, String year, int cT){
    super(name, year);
    capacityTonnage = cT;
    }
    public void setTonnage(int ton){
    capacityTonnage = ton;
    }
    public int getTonnage(){
    return capacityTonnage;
    }
    public String toString(){
    return "The name of the ship is "+getName()+"\nThe ship's cargo capacity in tonnage is "+capacityTonnage;
    }
}
