/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lenovo
 */
@Entity
public class LigneCommandeProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantite;
    
    @ManyToOne
    @JoinColumn(name ="produit_id")
    private Produit produit;
    
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;
    
    public LigneCommandeProduit(){}
    
    public LigneCommandeProduit(int quantite){
        this.quantite = quantite;
    }
    
    public LigneCommandeProduit(int quantite, Produit produit, Commande commande){
        this.quantite = quantite;
        this.produit = produit;
        this.commande = commande;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    
    public int getQuantite(){
        return quantite;
    }
    
    public void setQuantite(int quantite){
        this.quantite = quantite;
    }
}
