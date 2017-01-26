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
public class Vrijwilliger extends Persoon implements Oproepbaar {
    
    public Vrijwilliger(String naam) {
        super(naam);
    }
    
    public double berekenInkomsten() {
        return 0.0;
    }
    
    @Override
    public void huurIn(int uren) {
        
    }
}

