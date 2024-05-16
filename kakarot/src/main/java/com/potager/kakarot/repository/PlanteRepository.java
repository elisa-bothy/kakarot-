/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.potager.kakarot.repository;

import com.potager.kakarot.entities.Plantes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PlanteRepository extends JpaRepository<Plantes, Integer> {

    Plantes findByNom(String nom);

    public List<Plantes> findByRegionOrName(String nom, String region);

}
