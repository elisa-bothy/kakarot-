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
import service.PlanteService;

/**
 *
 * @author Elisa Bothy
 */
public class ControleurCalendrier {
      @Autowired
    private PlanteService planteService; // Injection du service ImagePropertiesService

    /**
     * Méthode pour la page d'accueil
     * @param model Le modèle utilisé pour transmettre des données à la vue
     * @return La vue "index"
     */
     @GetMapping("/calendrier") //questioning url
    public String calendrier (Model model) {
        List <Plantes> plantes = planteService.list();
        model.addAttribute("plantes", plantes);
        return "calendrier";
    }

}
