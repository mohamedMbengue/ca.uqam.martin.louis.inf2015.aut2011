/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.uqam.martin.louis.inf2015.aut2011;

public class Pret {
    private String id;
    private String description;
    private int montant;
    private int nombreAnnee;
    private int frequenceRemboursement;
    private int tauxInteret;
    private int frequenceComposition;
    
    public Pret() {
    }
    
    public Pret(String id, String description, int montant, int frequenceRemboursement, int tauxInteret, int frequenceComposition) {
        this.id = id;
        this.description = description;
        this.montant = montant;
        this.frequenceRemboursement = frequenceRemboursement;
        this.tauxInteret = tauxInteret;
        this.frequenceComposition = frequenceComposition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFrequenceComposition() {
        return frequenceComposition;
    }

    public void setFrequenceComposition(int frequenceComposition) {
        this.frequenceComposition = frequenceComposition;
    }

    public int getFrequenceRemboursement() {
        return frequenceRemboursement;
    }

    public void setFrequenceRemboursement(int frequenceRemboursement) {
        this.frequenceRemboursement = frequenceRemboursement;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(int tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public int getNombreAnnee() {
        return nombreAnnee;
    }

    public void setNombreAnnee(int nombreAnnee) {
        this.nombreAnnee = nombreAnnee;
    }

    @Override
    public String toString() {
        return  "\t\"id\":" + id +
                ",\n\t\"description:\"" + description + 
                ",\n\t\"montant\":" + montant + 
                ",\n\t\"nombreAnnee\":" + nombreAnnee + 
                ",\n\t\"frequenceRemboursement\":" + frequenceRemboursement + 
                ",\n\t\"tauxInteret\":" + tauxInteret + 
                ",\n\t\"frequenceComposition\":" + frequenceComposition + ",\n";
    }
    
    
    
}
