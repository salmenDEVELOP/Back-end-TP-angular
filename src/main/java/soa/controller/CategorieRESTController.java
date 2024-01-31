package soa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import soa.entities.Categorie;
import soa.entities.Produit;
import soa.metier.CategorieMetierImpl;
import soa.metier.CategorieMetierInterface;
import soa.repository.CategorieRepository;
import soa.repository.ProduitRepository;

import java.util.List;

@RestController // pour déclarer un service web de type REST
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/categories")
public class CategorieRESTController {

    @Autowired // pour l'injection de dépendances
    private CategorieMetierInterface categorieMetier;

    @GetMapping(
            // spécifier le path de la méthode
            value = "/",
            // spécifier le format de retour en XML
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})

    public List<Categorie> getAllCategories() {
        return categorieMetier.listeCategorie();
    }

    @PostMapping(
            // spécifier le path de la méthode
            value = "/"  ,
            //spécifier le format de retour
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public void addCategorie(@RequestBody Categorie c)
    {
        categorieMetier.ajouterCategorie(c);
    }
}
