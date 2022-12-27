package com.example.ejercicionavidades.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicionavidades.models.daos.IGrupoDAO;
import com.example.ejercicionavidades.models.entities.Grupo;

@Service
public class GrupoService {
    
    @Autowired
    private IGrupoDAO grupoDao;

    public void save(String nombre){
        Grupo grupo = new Grupo(nombre);
        this.grupoDao.save(grupo);
    }
    
}
