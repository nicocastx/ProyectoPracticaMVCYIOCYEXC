package com.springbootapp.proyectopracticamvcyiocyexc.controllers;

import com.springbootapp.proyectopracticamvcyiocyexc.Exceptions.NoExisteElementoException;
import com.springbootapp.proyectopracticamvcyiocyexc.models.dto.PlaylistDTO;
import com.springbootapp.proyectopracticamvcyiocyexc.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {
    @Autowired
    private PlaylistService playlistService;

    @GetMapping
    public List<PlaylistDTO> getAll(){
        return playlistService.getAll();
    }

    @GetMapping("/find")
    public PlaylistDTO getById(@RequestParam String id) throws NoExisteElementoException {
            return playlistService.getById(id);

    }
}
