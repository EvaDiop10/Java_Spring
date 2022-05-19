package com.example.atelierspring.controller;

import com.example.atelierspring.model.Produit;
import com.example.atelierspring.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProduitController {
    @Autowired
    ProduitService produitService;
    @GetMapping("/produits")
    public List<Produit> getProduits(){
        return  produitService.getAllProduit();
    }
    @GetMapping("/produits/{id}")
    public  Produit getProduit(@PathVariable("id") Long id){
        Optional<Produit> produit = produitService.getProduit(id);
        return produit.get();
    }
    @GetMapping("/produits/delete/{id}")
    public void  deleteProduit(@PathVariable("id") Long id){
        produitService.deleteProduit(id);

    }
    @PostMapping("/produits/create")
    public Produit createProduit(@RequestBody Produit produit){
        return produitService.saveProduit(produit);
    }
    @PutMapping("/produits/update/{id}")
    public Produit updateProduit(@PathVariable("id") long id,@RequestBody Produit produit){
        Optional<Produit> produit1 = produitService.getProduit(id);
        if (produit1.isPresent()){
            Produit p = produit1.get();
            String libelle = produit.getLibelle();
            if (libelle != null){
                p.setLibelle(libelle);
            }
            int quantite = produit.getQuantite();
            if (quantite != 0){
                p.setQuantite(quantite);
            }
            double prix = produit.getPrix();
            if (prix != 0){
                p.setPrix(prix);
            }

            produitService.saveProduit(p);
            return p;
        }
        else {
            return null;
        }
    }
}
