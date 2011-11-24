/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uqam.martin.louis.inf2015.aut2011;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FichierIntrant {
    private String nomFichier;
    private Pret unPret;
    private String chemin;

    public FichierIntrant(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public String getChemin() {
        return chemin;
    }
    
        
    
    public void lectureFichier(){

        try{
            BufferedReader entree = new BufferedReader(new FileReader(chemin));
            unPret = new Pret();
            try {
                String ligne;
                ligne = entree.readLine();//lire accolade ouvrante
                 ligne = entree.readLine();
                 unPret.setId(extraireChaine(ligne));
                 ligne = entree.readLine();
                 unPret.setDescription(extraireChaine(ligne));
                 ligne = entree.readLine();
                 unPret.setMontant(extraireEntier(ligne));
                 ligne = entree.readLine();
                 unPret.setNombreAnnee(extraireEntier(ligne));
                 ligne = entree.readLine();
                 unPret.setFrequenceRemboursement(extraireEntier(ligne));
                 ligne = entree.readLine();
                 unPret.setTauxInteret(extraireEntier(ligne));
                 ligne = entree.readLine();
                 unPret.setFrequenceComposition(extraireEntier(ligne));
            }finally {
                entree.close();
            }
        }catch (IOException ioe) {
            System.out.println("Erreur Lors de la lecture du fichier");
        }
        
    }
    
    private String extraireChaine(String chaine){
        int position = chaine.indexOf(':');
        return chaine.substring(position+1).replaceAll("\"", "").replace(',','\0');
    }
    
    private int extraireEntier(String chaine){
        int position = chaine.indexOf(':');
        try{
            return  Integer.parseInt(chaine.substring(position+1).replaceAll("\"", "").replaceAll(",",""));           
        }catch(NumberFormatException e){
            return 0;
        }
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public Pret getPret() {
        return unPret;
    }
    
    
}

