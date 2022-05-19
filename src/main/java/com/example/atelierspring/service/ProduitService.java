package com.example.atelierspring.service;

import com.example.atelierspring.model.Produit;
import com.example.atelierspring.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {
    @Autowired
    ProduitRepository produitRepository;

    public List<Produit> getAllProduit(){
        return produitRepository.findAll();
    }
    public Optional<Produit> getProduit(Long id){
        return produitRepository.findById(id);
    }
    public Produit saveProduit(Produit produit){
        Produit p = produitRepository.save(produit);
        return p;
    }
    public  void deleteProduit(Long id){
        produitRepository.deleteById(id);
    }
}
