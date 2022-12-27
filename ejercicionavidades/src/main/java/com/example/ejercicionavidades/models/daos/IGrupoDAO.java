package com.example.ejercicionavidades.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicionavidades.models.entities.Grupo;

@Repository
public interface IGrupoDAO extends JpaRepository<Grupo, Long>{
    
}
