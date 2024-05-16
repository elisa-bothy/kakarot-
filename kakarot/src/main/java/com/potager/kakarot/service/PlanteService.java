package com.potager.kakarot.service;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.potager.kakarot.entities.Plantes;
import java.util.List;
import com.potager.kakarot.repository.PlanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanteService {
    @Autowired
    private final PlanteRepository planteRepository;

    public PlanteService(PlanteRepository planteRepository) {
        this.planteRepository = planteRepository;
    }

    public List<Plantes> findAll() {
        return (List<Plantes>) planteRepository.findAll();

    }

    public Plantes findByNom(String nom) {
        return planteRepository.findByNom(nom);
    }
    
    public Plantes savePlante (Plantes plante) {
        return planteRepository.save(plante);
    }
    
}
