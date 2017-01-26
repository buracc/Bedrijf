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
public abstract class Persoon implements Comparable<Persoon> {
    private String naam;
    
    public Persoon(String naam) {
        this.naam = naam;
    } 
    
    public abstract double berekenInkomsten();
    
    public int compareTo(Persoon ander) {
        return naam.compareTo(ander.naam);
    }
    
    public String toString(){
        return naam;
    }
}
