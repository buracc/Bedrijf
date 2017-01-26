/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.oop1.bedrijf.models;

/**
 *
 * @author Burak
 */
public class Manager extends Werknemer {
    private double bonus;
    
    public Manager(int maandsalaris, String naam) {
        super(maandsalaris, naam);
    }
    
    public void kenBonusToe(double bonus) {
        this.bonus = bonus;
    }
    
    public double berekenInkomsten() {
        double inkomsten = bonus + super.berekenInkomsten();
        return inkomsten;
    }
}
