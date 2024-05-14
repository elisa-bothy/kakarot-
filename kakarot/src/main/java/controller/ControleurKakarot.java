/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import service.PlanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Valentina Sarais
 */
@Controller
@RequestMapping("/")
public class ControleurKakarot {

      private final PlanteService planteService;    
    /**
     *
     * @param planteService
     * service qui fait le lien entre le metier et la data
     */
    @Autowired
	public ControleurKakarot(PlanteService planteService) {
		this.planteService = planteService;
	}
        
    @GetMapping("/accueil")
    public String accueil() {
        return "accueil"; // Nom de la vue JSP (accueil.jsp)
    }

    
    }
    

