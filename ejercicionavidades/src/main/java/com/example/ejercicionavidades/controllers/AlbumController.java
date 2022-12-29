package com.example.ejercicionavidades.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicionavidades.models.entities.Album;
import com.example.ejercicionavidades.models.entities.Grupo;
import com.example.ejercicionavidades.services.AlbumService;
import com.example.ejercicionavidades.services.GrupoService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/album")
public class AlbumController {
    
    @Autowired
    private AlbumService albumService;

    @Autowired
    private GrupoService grupoService;

    @GetMapping("/lista-albumes")   //http:localhost:8080/api/album/lista-albumes
    public List<Album> listar(){
        return this.albumService.list();
    }

    @PostMapping("/anadir/{nombreGrupo}/{nombreAlbum}")   //http:localhost:8080/api/album/anadir/{nombreGrupo}/{nombreAlbum}
    public Album anadirAlbum(@PathVariable String nombreGrupo,@PathVariable String nombreAlbum){
        Grupo grupo = this.grupoService.findByNameGrupo(nombreGrupo).get(0);
        return this.albumService.save(grupo, nombreAlbum);
    }

    @GetMapping("/lista-albumes-del-grupo/{nombreDelGrupo}")   //http:localhost:8080/api/album/lista-albumes-del-grupo/
    public List<Album> listarAlbumesDelGrupo(@PathVariable String nombreDelGrupo){
        return this.albumService.albumesDelGrupo(nombreDelGrupo);
    }
}
