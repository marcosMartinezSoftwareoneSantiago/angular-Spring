package com.example.ejercicionavidades.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicionavidades.models.daos.IGrupoDAO;
import com.example.ejercicionavidades.models.entities.Grupo;

@Service
public class GrupoService {
    
    @Autowired
    private IGrupoDAO grupoDao;

    public Grupo save(String nombre){
        Grupo grupo = new Grupo(nombre);
        return this.grupoDao.save(grupo);
    }

    public List<Grupo> findByNameGrupo(String nombreGrupo){
        return grupoDao.findByNombre(nombreGrupo);
    }
    
}
