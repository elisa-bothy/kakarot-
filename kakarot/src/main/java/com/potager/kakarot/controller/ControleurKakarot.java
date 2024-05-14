/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.potager.kakarot.controller;

import com.potager.kakarot.repository.PlanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Valentina Sarais
 */
@Controller
@RequestMapping("/plantes")
public class ControleurKakarot {

      private final PlanteService planteService;
      
    /**
     *
     * @param planteService
     */
    @Autowired
	public ControleurKakarot(PlanteService planteService) {
		this.planteService = planteService;
	}
    }
    

