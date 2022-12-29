package com.example.ejercicionavidades.models.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupos_musicales")
public class Grupo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "nombre_grupo")
    private String nombre;

    @JsonManagedReference
    @OneToMany(mappedBy = "grupo")
    private List<Album> albumes;


    public Grupo() {
    }

    public Grupo(Long id, String nombre, List<Album> albumes) {
        this.id = id;
        this.nombre = nombre;
        this.albumes = albumes;
    }

    public Grupo(String nombre){
        this.nombre = nombre;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Album> getAlbumes() {
        return this.albumes;
    }

    public void setAlbumes(List<Album> albumes) {
        this.albumes = albumes;
    }

}
