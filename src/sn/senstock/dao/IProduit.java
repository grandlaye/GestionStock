package sn.senstock.dao;

import sn.senstock.entities.Produit;

import java.util.List;

public interface IProduit {

    public int add(Produit produit);
    public List<Produit> list();
}
