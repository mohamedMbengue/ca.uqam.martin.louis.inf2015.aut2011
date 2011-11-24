/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uqam.martin.louis.inf2015.aut2011;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FichierExtrant {
    private String nomFichier;
    private Pret unPret;
    

    public FichierExtrant(String nomFichier) {
        this.nomFichier = nomFichier;
    }
    
    public void ecrireFichier(String remboursement){
        try{
            PrintWriter sortie = new PrintWriter(new FileWriter(nomFichier));
            try {
               sortie.println(remboursement);
               System.out.println(remboursement);
            }finally {
                sortie.close();
            }
        }catch (IOException ioe) {
            System.out.println("Erreur Lors de la l'ecriture du fichier");
        }
    }
    
    

    
}