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
public class Werknemer extends Persoon {
    private static int laatstePersoneelsnummer;
    private double maandSalaris;
    private int personeelsnummer;
    
    public Werknemer(double maandSalaris, String naam) {
        super(naam);
        this.maandSalaris = maandSalaris;
        this.personeelsnummer = ++ laatstePersoneelsnummer;
    }
    
    @Override
    public double berekenInkomsten() {
        double inkomsten = maandSalaris;
        return inkomsten;
    }
}
