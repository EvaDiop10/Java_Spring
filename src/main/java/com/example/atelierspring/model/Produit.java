package com.example.atelierspring.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;
    private int quantite;
    private double prix;

    public long getId() {
        return this.id;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public int getQuantite() {
        return this.quantite;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Produit)) return false;
        final Produit other = (Produit) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$libelle = this.getLibelle();
        final Object other$libelle = other.getLibelle();
        if (this$libelle == null ? other$libelle != null : !this$libelle.equals(other$libelle)) return false;
        if (this.getQuantite() != other.getQuantite()) return false;
        if (Double.compare(this.getPrix(), other.getPrix()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Produit;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $id = this.getId();
        result = result * PRIME + (int) ($id >>> 32 ^ $id);
        final Object $libelle = this.getLibelle();
        result = result * PRIME + ($libelle == null ? 43 : $libelle.hashCode());
        result = result * PRIME + this.getQuantite();
        final long $prix = Double.doubleToLongBits(this.getPrix());
        result = result * PRIME + (int) ($prix >>> 32 ^ $prix);
        return result;
    }

    public String toString() {
        return "Produit(id=" + this.getId() + ", libelle=" + this.getLibelle() + ", quantite=" + this.getQuantite() + ", prix=" + this.getPrix() + ")";
    }
}
