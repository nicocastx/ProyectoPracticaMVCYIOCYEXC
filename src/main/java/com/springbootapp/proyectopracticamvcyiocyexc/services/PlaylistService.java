package com.springbootapp.proyectopracticamvcyiocyexc.services;

import com.springbootapp.proyectopracticamvcyiocyexc.repositories.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService {
    @Autowired
    private PlaylistRepository repoPlaylist;
}
