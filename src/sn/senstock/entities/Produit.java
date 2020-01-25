package sn.senstock.entities;

import javax.persistence.*;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private  String nom;
    @Column
    private double qtStock;

    public Produit() {
    }

    public Produit(int id, String nom, double qtStock) {
        this.id = id;
        this.nom = nom;
        this.qtStock = qtStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getQtStock() {
        return qtStock;
    }

    public void setQtStock(double qtStock) {
        this.qtStock = qtStock;
    }
}

