package com.example.ejercicionavidades.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "albumes_musicales")
public class Album {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Grupo grupo;

    @Column(name= "nombre_album")
    private String nombre;


    public Album() {
    }

    public Album(Long id, Grupo grupo, String nombre) {
        this.id = id;
        this.grupo = grupo;
        this.nombre = nombre;
    }

    public Album(Grupo grupo, String nombre) {
        this.grupo = grupo;
        this.nombre = nombre;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Grupo getGrupo() {
        return this.grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}