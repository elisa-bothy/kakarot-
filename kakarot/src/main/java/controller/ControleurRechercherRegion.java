/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entities.Plantes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import service.PlanteService;

/**
 *
 * @author Elisa Bothy
 */
public class ControleurRechercherRegion {
      @Autowired
    private PlanteService planteService; // Injection du service ImagePropertiesService

    /**
     * Méthode pour la page d'accueil
     * @param query
     * @param model Le modèle utilisé pour transmettre des données à la vue
     * @return La vue "index"
     */
     @GetMapping("/rechercherRegion") //questioning url
    public String rechercherRegion (@RequestParam("query") String query, Model model) {
        List <Plantes> searchResults = planteService.rechercherPlante(query);
        model.addAttribute("searchResults", searchResults);
        model.addAttribute("searchQuery", query);
        return "rechercherRegion";
    }
}
