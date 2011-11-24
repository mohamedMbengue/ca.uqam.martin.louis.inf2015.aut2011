/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uqam.martin.louis.inf2015.aut2011;


import java.util.ArrayList;
public class Remboursement {
    private Pret unPret;
    private ArrayList<Periode> listePeriode;
    private float versementPeriodique;
    
    public Remboursement(Pret unPret) {
        this.unPret = unPret;
        listePeriode = new ArrayList<Periode>();
    }
    
    public void ajouterPeriode(Periode unePeriode){
        listePeriode.add(unePeriode);
    }

    public void setVersementPeriodique(float versementPeriodique) {
        this.versementPeriodique = versementPeriodique;
    }
    
    

    @Override
    public String toString() {
        String chaine;
        chaine = "{\n" + unPret.toString() + "\t\"versementPeriodique\":"+versementPeriodique + "\n\t\"amortissement\" : [\n";
        for(int i = 0; i<listePeriode.size(); i++){
            chaine += listePeriode.get(i).toString();
        }
        chaine += "\n\t]\n}";
        return chaine;
    }
    
    
}
