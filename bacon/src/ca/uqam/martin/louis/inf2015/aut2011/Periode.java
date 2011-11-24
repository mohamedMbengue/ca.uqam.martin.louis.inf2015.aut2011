/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uqam.martin.louis.inf2015.aut2011;

public class Periode {
    private int numPeriode;
    private float capitalDebut;
    private final float versementTotal;
    private float versementInteret;
    private float versementCapital;
    private float capitalFin;
    private static float versementTotalCumulatif = 0;
    private static float versementInteretCumulatif = 0;
    private static float versementCapitalCumulatif = 0;
    private static int nbPeriode = 0;
    

    public Periode(float capitalDebut, float versementTotal, float versementInteret, float versementCapital, float capitalFin) {
        this.capitalDebut = capitalDebut;
        this.versementTotal = versementTotal;
        this.versementInteret = versementInteret;
        this.versementCapital = versementCapital;
        this.capitalFin = capitalFin;
        versementTotalCumulatif += versementTotal;
        versementInteretCumulatif += versementInteret;
        versementCapitalCumulatif += versementCapital;
        numPeriode = ++nbPeriode;
    }

    public int getNumPeriode() {
        return numPeriode;
    }

    
    public float getCapitalDebut() {
        return capitalDebut;
    }
    
    public void setCapitalDebut(float capitalDebut) {
        this.capitalDebut = capitalDebut;
    }
            
    public float getCapitalFin() {
        return capitalFin;
    }

    public void setCapitalFin(float capitalFin) {
        this.capitalFin = capitalFin;
    }

    public double getVersementCapital() {
        return versementCapital;
    }

    public void setVersementCapital(float versementCapital) {
        this.versementCapital = versementCapital;
    }


    public float getVersementInteret() {
        return versementInteret;
    }

    public void setVersementInteret(float versementInteret) {
        this.versementInteret = versementInteret;
    }

    public double getVersementTotal() {
        return versementTotal;
    }



    public static void setNbPeriode(int nbPeriode) {
        Periode.nbPeriode = nbPeriode;
        versementCapitalCumulatif = 0;
        versementInteretCumulatif = 0;
        versementTotalCumulatif = 0;
    }

    public void setNumPeriode(int numPeriode) {
        this.numPeriode = numPeriode;
    }
    
    @Override
    public String toString() {
        return  "\t\t{" + 
                "\n\t\t\t\"numPeriode\":" + numPeriode + 
                ",\n\t\t\t\"capitalDebut\"" + capitalDebut + 
                ",\n\t\t\t\"versementTotal\":" + versementTotal + 
                ",\n\t\t\t\"versementInteret\":" + versementInteret + 
                ",\n\t\t\t\"versementCapital\":" + versementCapital + 
                ",\n\t\t\t\"capitalFin\":" + capitalFin +
                ",\n\t\t\t\"versementTotalCumulatif\":" + versementTotalCumulatif +
                ",\n\t\t\t\"versementInteretCumulatif\":" + versementInteretCumulatif +
                ",\n\t\t\t\"versementCapitalCumulatif\":" + versementCapitalCumulatif +
                "\n\t\t},\n";
    }

        
    
}
