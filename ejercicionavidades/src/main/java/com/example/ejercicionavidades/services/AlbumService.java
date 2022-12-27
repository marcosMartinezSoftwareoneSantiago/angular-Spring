package com.example.ejercicionavidades.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicionavidades.models.daos.IAlbumDAO;
import com.example.ejercicionavidades.models.entities.Album;
import com.example.ejercicionavidades.models.entities.Grupo;

@Service
public class AlbumService {
    
    @Autowired
    private IAlbumDAO albumDao;

    public void save(Grupo grupo, String name){
        Album album = new Album(grupo, name);
        this.albumDao.save(album);
    }

    public List<String[]> list(){
        List<Album> albumes = this.albumDao.findAll();
        List<String[]> arrayAlbumes = new ArrayList<String[]>();
        for (Album album : albumes) {
            String[] albumString = new String[2];
            albumString[0] = album.getGrupo().getNombre();
            albumString[1] = album.getNombre();
            arrayAlbumes.add(albumString);
        }
        return arrayAlbumes;
    }
}
