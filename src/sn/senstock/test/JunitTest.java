package sn.senstock.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sn.senstock.dao.IProduit;
import sn.senstock.dao.ProduitImpl;
import sn.senstock.entities.Produit;

public class JunitTest {

    @Before
    public void beforTest() {
        System.out.println("===============Before===============");
    }

    @After
    public void afterTest() {
        System.out.println("=============After===============");
    }

    @Test
    public void testAddProduit() {
        IProduit produitdao = new ProduitImpl();
        Produit produit = new Produit();
        produit.setNom("table");
        produit.setQtStock(12);

        produitdao.add(produit);
    }
}
