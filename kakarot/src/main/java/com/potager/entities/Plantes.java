/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.potager.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

/**
 *
 * @author Igor Martellote
 */
@Entity
@SuppressWarnings("serial")
public class Plantes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    private String nom;
    private String categorie;
    private String astuce;
    private String planter;
    private String recolter;
    private String region;

    //GET and SET
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getAstuce() {
        return astuce;
    }

    public void setAstuce(String astuce) {
        this.astuce = astuce;
    }

    public String getPlanter() {
        return planter;
    }

    public void setPlanter(String planter) {
        this.planter = planter;
    }

    public String getRecolter() {
        return recolter;
    }

    public void setRecolter(String recolter) {
        this.recolter = recolter;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    //Constructor default and empty
    public Plantes(String nom, String categorie, String astuce, String planter, String recolter, String region) {
        this.nom = nom;
        this.categorie = categorie;
        this.astuce = astuce;
        this.planter = planter;
        this.recolter = recolter;
        this.region = region;
    }

    public Plantes() {
    }

    // to string
    @Override
    public String toString() {
        return "Plante{" + "id=" + id + ", nom=" + nom + ", categorie=" + categorie + ", astuce=" + astuce + ", planter=" + planter + ", recolter=" + recolter + ", region=" + region + '}';
    }

    

    

    

}
