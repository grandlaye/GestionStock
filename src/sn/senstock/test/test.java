package sn.senstock.test;

import sn.senstock.dao.IProduit;
import sn.senstock.dao.ProduitImpl;
import sn.senstock.entities.Produit;

public class test {

    public static void main(String[] args) {
        IProduit produitdao = new ProduitImpl();

        Produit produit = new Produit();
        produit.setNom("ordinateur");
        produit.setQtStock(125);

        int ok = produitdao.add(produit);
        System.out.println(ok);
    }
}
