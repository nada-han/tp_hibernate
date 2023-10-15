/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import ma.projet.service.ProduitService;
import ma.projet.entity.Produit;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Test {

    public static void main(String[] args) {
        //Creer 5 produits
        ProduitService ps = new ProduitService();
//        ps.create(new Produit(1,"Crayon","A0", new Date(), 4, "p0"));
//        ps.create(new Produit(2,"Cahier","A1", new Date(), 80, "p1"));
//        ps.create(new Produit(3,"Stylo","A2", new Date(), 2.5, "p3"));
//        ps.create(new Produit(4,"Livre","A3", new Date(), 350, "p4"));
//        ps.create(new Produit(1,"Bloc-Note","A4", new Date(), 60, "p5"));

        //liste des produits
//        for (Produit p : ps.findAll()) {
//            System.out.println(p.getMarque());
//        }
        //Info du produit dont id=2
//        for (Produit p : ps.findAll()) {
//            if (p.getId() == 2) {
//                System.out.println("Id : " + p.getId() + " Marque : " + p.getMarque() + " Reference : " + p.getReference() + " Date Achat : " + p.getDateAchat() + " Prix : " + p.getPrix() + " Designation : " + p.getDesignation());
//            }
//        }
        
        //Supprimer le produit dont id=3
//        ps.delete(ps.findById(3));
        
        //Modifier les info du produit dont id=1
//        Produit p = ps.findById(1);
//        p.setMarque("Feutre");
//        p.setPrix(10);
//        ps.update(p);
        
        //la liste des produits dont le prix est sup a 100
        for ( Produit p : ps.findAll()){
            if (p.getPrix() > 100){
                System.out.println("Produit : "+p.getMarque());
            }
        }

    }

}
