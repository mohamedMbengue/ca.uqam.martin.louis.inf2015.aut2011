/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uqam.martin.louis.inf2015.aut2011;

import java.io.File;

public class RepertoireExtrant {
    private File rep;
    private String nomRepertoire;

    public RepertoireExtrant(String nomRepertoire) {
        this.nomRepertoire = nomRepertoire;
    }
    
    public void ajouterFichier(String nomFichier, String remboursement){
        FichierExtrant fic = new FichierExtrant(nomRepertoire+"/"+nomFichier);
        fic.ecrireFichier(remboursement);
    }
    
}
