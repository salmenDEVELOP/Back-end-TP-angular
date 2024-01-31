package soa.controller;

import soa.entities.Categorie;

public class CritereRecherche {
    private float prix;
    private Categorie categorie;

    public CritereRecherche() {
    }

    public CritereRecherche(Categorie categorie,float prix) {
        this.prix = prix;
        this.categorie = categorie;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }


    @Override
    public String toString() {
        return "CritereRecherche{" +
                "prix=" + prix +
                ", categorie=" + categorie +
                '}';
    }
}
