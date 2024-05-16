package service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import entities.Plantes;
import java.util.List;
import repository.PlanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlanteService {

    private final PlanteRepository planteRepository;

    @Autowired
    public PlanteService(PlanteRepository planteRepository) {
        this.planteRepository = planteRepository;
    }

    public Plantes findPlanteByName(String name) {
        return planteRepository.findByName(name);
    }

    // Autres méthodes de service si nécessaire

    public void deleteById (Integer id) {
        planteRepository.deleteById (id);
    }
    
    public List<Plantes> list () {
        return (List<Plantes>) planteRepository.findAll();
    }
    
     public List<Plantes> rechercherPlante (String query) {
        return planteRepository.findByRegionOrName (query, query);
    }
}
