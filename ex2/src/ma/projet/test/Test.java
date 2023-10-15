/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import java.util.List;
import ma.projet.classes.Categorie;
import ma.projet.classes.Commande;
import ma.projet.classes.LigneCommandeProduit;
import ma.projet.classes.Produit;
import ma.projet.service.CategorieService;
import ma.projet.service.CommandeService;
import ma.projet.service.LigneCommandeService;
import ma.projet.service.ProduitService;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class Test {

    public static void main(String[] args) {
        HibernateUtil.getSessionFactory();

//        ProduitService ps = new ProduitService();
//        LigneCommandeService lc = new LigneCommandeService();
//        CategorieService cas = new CategorieService();
//        CommandeService cos = new CommandeService();
        
        
        
        //Produit par categorie
        //Creer d'une categorie
        CategorieService cas = new CategorieService();
        Categorie c1 = new Categorie("A00", "Cat1");
//        cas.create(c1);
        Categorie c2 = new Categorie("A01", "Cat2");
//        cas.create(c2);

        //Creer des produits par la categorie c1
        ProduitService ps = new ProduitService();
        Produit p1 = new Produit("Ref1", 200, c1);
        Produit p2 = new Produit("Ref2", 300, c1);
//        ps.create(p1);
//        ps.create(p2);
        
        Produit p3 = new Produit("Ref3", 40, c2);
//        ps.create(p3);

//        List<Produit> prodDeCat = ps.getProduitsByCategorie(c2);
//        
//        if (prodDeCat != null) {
//            System.out.println("Liste des produits de la catégorie : " + c2.getCode());
//            for (Produit produit : prodDeCat) {
//                System.out.println("Référence du produit: " + produit.getReference());
//                System.out.println("Prix du produit: " + produit.getPrix() + " DH");
//            }
//        } else {
//            System.out.println("Error");
//        }

        //Produits commandes dans une commande donnee
        CommandeService cos = new CommandeService();
        Commande commande1 = new Commande(new Date());
        Commande commande2 = new Commande(new Date());
        Commande commande3 = new Commande(new Date());
//        cos.create(commande1);
//        cos.create(commande2);
        cos.create(commande3);
        
        LigneCommandeService lc = new LigneCommandeService();
        LigneCommandeProduit lcpp = new LigneCommandeProduit(390, p2, commande3);
        LigneCommandeProduit lcp2 = new LigneCommandeProduit(56, p3, commande2);
        lc.create(lcpp);
        
        cos.getproduitCommandes(3);
        
        
        
        
        
        
        
    }
}
