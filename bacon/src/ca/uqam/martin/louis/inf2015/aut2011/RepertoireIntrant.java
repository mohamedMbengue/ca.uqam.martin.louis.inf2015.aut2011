/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uqam.martin.louis.inf2015.aut2011;

import java.io.File;
import java.util.ArrayList;

public class RepertoireIntrant {
    private File rep;
    private String liste[];
    private String nomRepertoire;
    private ArrayList<FichierIntrant> lesFichiers;

    public RepertoireIntrant(String nomRepertoire) {
        this.nomRepertoire = nomRepertoire;
        lesFichiers = new ArrayList<FichierIntrant>();
        lireRepertoire();
    }
    
    private void lireRepertoire(){
        rep = new File(nomRepertoire);
        if (rep.exists()) {
            liste = rep.list();
            for(int i=0;i<liste.length;i++) {
                File entree = new File(liste[i]);
                FichierIntrant fic = new FichierIntrant(entree.getName());
                fic.setChemin(nomRepertoire+"/"+entree.getName());
                lesFichiers.add(fic);
            }
        }
        else System.out.print("le repertoire "+nomRepertoire+"n'existe pas");
    
    }

    public ArrayList<FichierIntrant> getLesFichiers() {
        return lesFichiers;
    }
    
}



