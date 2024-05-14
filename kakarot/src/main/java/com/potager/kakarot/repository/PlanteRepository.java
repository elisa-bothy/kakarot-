/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.potager.kakarot.repository;

import com.potager.kakarot.entities.Plantes;

import org.springframework.data.repository.CrudRepository;


public interface PlanteRepository extends CrudRepository<Plantes, Long> {

    Plantes findByName(String name);

}

