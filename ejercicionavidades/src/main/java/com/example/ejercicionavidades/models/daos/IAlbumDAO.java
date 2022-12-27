package com.example.ejercicionavidades.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicionavidades.models.entities.Album;

public interface IAlbumDAO extends JpaRepository<Album, Long>{
    
}
