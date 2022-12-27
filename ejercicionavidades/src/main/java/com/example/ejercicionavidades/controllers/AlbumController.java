package com.example.ejercicionavidades.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicionavidades.services.AlbumService;

@RestController
@RequestMapping("/api")
public class AlbumController {
    
    @Autowired
    private AlbumService albumService;

    @GetMapping("/lista-albumes")   //http:localhost:8080/api/lista-albumes
    public List<String[]> listar(){
        return this.albumService.list();
    }
}
