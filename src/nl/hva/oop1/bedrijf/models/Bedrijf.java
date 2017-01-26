/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.oop1.bedrijf.models;

import java.util.ArrayList;

/**
 *
 * @author Burak
 */
public class Bedrijf {
    private String naam;
    private ArrayList<Persoon> medewerkers;
    
    public Bedrijf(String naam) {
        this.naam = naam;
        this.medewerkers = new ArrayList<Persoon>();
    }
    
    public void printInkomsten() {
        for (int i = 0; i < medewerkers.size(); i++) {
            System.out.print(medewerkers.get(i));
            
            double inkomsten = medewerkers.get(i).berekenInkomsten();
            
            if (inkomsten == 0) {
                System.out.println(", bedankt voor uw inzet!");
            } else {
                System.out.println(", inkomsten: " + inkomsten);
            }
        }
    }
    
    public int aantalManagers() {
        int aantal = 0;
        
        for (int i = 0; i < medewerkers.size(); i++) {
            if (medewerkers.get(i) instanceof Manager) {
                aantal++;
        }
        }
        return aantal;
    }
    
    public void neemInDienst(Persoon persoon) {
        medewerkers.add(persoon);
    }
    
    public String toString() {
        String s = "Bedrijf " + this.naam + " heeft " + medewerkers.size() + " in dienst \n\n";
        
        for (Persoon p : medewerkers) {
            s += p + " \n";
        }
        return s;
    }
}
    
