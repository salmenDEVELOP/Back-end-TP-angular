package soa.metier;

import soa.entities.Categorie;
import soa.repository.CategorieRepository;

import java.util.List;

public interface CategorieMetierInterface
{
    void ajouterCategorie(Categorie c);
    List<Categorie> listeCategorie();

}
