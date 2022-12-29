package com.example.ejercicionavidades.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicionavidades.models.entities.Grupo;
import com.example.ejercicionavidades.services.GrupoService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/grupo")
public class GrupoController {
    
    @Autowired
    private GrupoService grupoService;

    @PostMapping("/anadir/{nombreGrupo}")   //http:localhost:8080/api/grupo/anadir/
    public Grupo anadirGrupo(@PathVariable String nombreGrupo){
        return this.grupoService.save(nombreGrupo);
    }
}
