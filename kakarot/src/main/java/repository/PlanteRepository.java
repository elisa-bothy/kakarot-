/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entities.Plantes;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface PlanteRepository extends CrudRepository<Plantes, Integer> {

    Plantes findByName(String name);

    public List<Plantes> findByRegionOrName(String nom, String region);

}

