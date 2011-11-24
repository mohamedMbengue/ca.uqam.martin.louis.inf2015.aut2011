/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uqam.martin.louis.inf2015.aut2011;

import java.util.ArrayList; 


public class tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<FichierIntrant> lesFichiers;
        double tauxAnnuel;
        double tauxMensuel;
        float versementTotal;
        float nbMois;
        int index = 0;
        
        RepertoireIntrant rep = new RepertoireIntrant("fichiers intrant");
        RepertoireExtrant repEx = new RepertoireExtrant("fichiers extrant");
        lesFichiers = rep.getLesFichiers();
        
        while(index<lesFichiers.size()){
            Periode.setNbPeriode(0);
            Pret unPret;
        Remboursement unRemboursement;
        Periode periodeActuelle = null;
        Periode periodeSuivante;
            FichierIntrant unFichier = lesFichiers.get(index);
            unFichier.lectureFichier();
            unPret = unFichier.getPret();
            tauxAnnuel = obtenirTauxAnnuel(unPret.getTauxInteret());
            tauxMensuel = obtenirTauxMensuel(tauxAnnuel, unPret.getNombreAnnee(), (unPret.getNombreAnnee()* 12));
            nbMois = unPret.getNombreAnnee()* 12;
            versementTotal = round(calculerVersementTotal(unPret.getMontant(), tauxMensuel, nbMois));
            unRemboursement = new Remboursement(unPret);
            periodeActuelle = remboursementPeriode(unPret.getMontant(), tauxMensuel, versementTotal);
            unRemboursement.ajouterPeriode(periodeActuelle);
            unRemboursement.setVersementPeriodique(versementTotal);

            nbMois--;
            while(nbMois>0){
                periodeSuivante = remboursementPeriode(periodeActuelle.getCapitalFin(), tauxMensuel, versementTotal);
                periodeActuelle = periodeSuivante;
                unRemboursement.ajouterPeriode(periodeActuelle);
                nbMois--;
            }
            repEx.ajouterFichier(unFichier.getNomFichier(), unRemboursement.toString());
            index++;
        }
        
    }//main
    
    public static double obtenirTauxAnnuel(double tauxInteret){       
        return Math.pow((1+((tauxInteret/100)/2)), 2)-1;
    }
    
    public static double obtenirTauxMensuel(double tauxAnnuel, float annee, float mois){
        return Math.pow((1+tauxAnnuel), (annee/mois))-1;
    }
    
    public static double calculerVersementTotal(float montant, double tauxMensuel, float mois){
        return montant/((1-Math.pow(1+tauxMensuel, -1.0*mois))/tauxMensuel);
    }
    
    
    public static Periode remboursementPeriode(float capitalDebut, double tauxMensuel, float versementTotal){
        Periode unePeriode;
        float versementInteret = round(capitalDebut*tauxMensuel);
        float versementCapital = round(versementTotal - versementInteret);
        float capitalFin = round(capitalDebut - versementCapital);
        
        unePeriode = new Periode (capitalDebut, versementTotal, versementInteret, versementCapital, capitalFin);
        return unePeriode;
    }
    
    public static float round(double nombre){
        float nbRound;
        nbRound = (float)((int)(nombre *1000))/1000;
        return nbRound;
    }
    
    
}
