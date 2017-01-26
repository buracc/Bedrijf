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
public class Zzper extends Persoon implements Oproepbaar {
    private double uurtarief;
    private int urenGewerkt;
    
    public Zzper(double uurtarief, String naam) {
        super(naam);
        this.uurtarief = uurtarief;
        this.urenGewerkt = 0;
    }
    
    public double berekenInkomsten() {
        double inkomsten = (uurtarief * urenGewerkt);
        return inkomsten;
    }

    @Override
    public void huurIn(int uren) {
        urenGewerkt += uren;
    }
    
}
