package com.example.atelierspring;

import com.example.atelierspring.model.Produit;
import com.example.atelierspring.service.ProduitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AtelierSpringApplicationTests {
    @Autowired
    ProduitService produitService;
    @Test
    void contextLoads() {
    }
    @Test
    public  void testAjout(){
        Produit p = new Produit();
        p.setLibelle("Sac");
        p.setPrix(450.0);
        p.setQuantite(2);

        produitService.saveProduit(p);
    }

}
