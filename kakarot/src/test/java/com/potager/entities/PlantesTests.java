/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.potager.entities;
import entities.Plantes;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
/**
 *
 * @author Igor Martellotee
 */


public class PlantesTests {

    @Test
    public void testGetAndSetNom() {
        Plantes plante = new Plantes();
        plante.setNom("Tomate");
        assertEquals("Tomate", plante.getNom());
    }

    @Test
    public void testGetAndSetCategorie() {
        Plantes plante = new Plantes();
        plante.setCategorie("Legume");
        assertEquals("Legume", plante.getCategorie());
    }

    @Test
    public void testGetAndSetAstuce() {
        Plantes plante = new Plantes();
        plante.setAstuce("arroser regulierment");
        assertEquals("arroser regulierment", plante.getAstuce());
    }

    @Test
    public void testGetAndSetPlanter() {
        Plantes plante = new Plantes();
        plante.setPlanter("Mai");
        assertEquals("Mai", plante.getPlanter());
    }

    @Test
    public void testGetAndSetRecolter() {
        Plantes plante = new Plantes();
        plante.setRecolter("Juin");
        assertEquals("Juin", plante.getRecolter());
    }

    @Test
    public void testGetAndSetRegion() {
        Plantes plante = new Plantes();
        plante.setRegion("Occitanie");
        assertEquals("Occitanie", plante.getRegion());
    }

    @Test
    public void testToString() {
        Plantes plante = new Plantes("Tomate", "Legume", "arroser regulierment", "Mai", "Juin", "Occitanie");
        String expected = "Plante{id=0, nom=Tomate, categorie=Legume, astuce=arroser regulierment, planter=Mai, recolter=Juin, region=Occitanie}";
        assertEquals(expected, plante.toString());
    }
}
