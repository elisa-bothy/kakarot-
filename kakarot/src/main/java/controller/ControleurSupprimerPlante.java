/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import service.PlanteService;

/**
 *
 * @author Elisa Bothy
 */
public class ControleurSupprimerPlante{
    @Autowired
    private PlanteService planteService; // Injection du service ImagePropertiesService

    /**
     * Méthode pour la page d'accueil
     * @param id
     * @return La vue "index"
     */
     @GetMapping("/{id}") //questioning url
    public String deletePlante (@PathVariable ( "id" ) Integer id) {
        planteService.deleteById (id);
        return "redirect:/";
    }
}
