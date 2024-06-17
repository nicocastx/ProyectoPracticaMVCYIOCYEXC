package com.springbootapp.proyectopracticamvcyiocyexc.services;

import com.springbootapp.proyectopracticamvcyiocyexc.Exceptions.NoExisteElementoException;
import com.springbootapp.proyectopracticamvcyiocyexc.models.Playlist;
import com.springbootapp.proyectopracticamvcyiocyexc.models.dto.PlaylistDTO;
import com.springbootapp.proyectopracticamvcyiocyexc.repositories.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepository repoPlaylist;

    public List<PlaylistDTO> getAll(){
        List<PlaylistDTO> playlistDTOS = new ArrayList<>();
        List<Playlist> playlists = repoPlaylist.getAll();

        for(Playlist pl : playlists){
            PlaylistDTO playlistDTO = buildDTOPlaylist(pl);
            playlistDTOS.add(playlistDTO);
        }
        return playlistDTOS;
    }

    public PlaylistDTO getById(String id) throws NoExisteElementoException {
        PlaylistDTO plDTO = new PlaylistDTO();
        Playlist playlistBuscada = repoPlaylist.getById(Integer.parseInt(id));
        plDTO =  buildDTOPlaylist(playlistBuscada);
        //si se activa esto, el controlador ya no maneja la excepcion
        //! Si se quiere, que el controlador tome la excepcion, se debe expandir el throws desde el repository hasta el controller
        /*
        try {
            Playlist playlistBuscada = repoPlaylist.getById(Integer.parseInt(id));
            plDTO =  buildDTOPlaylist(playlistBuscada);
        } catch (NoExisteElementoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("ERROR AL FORMATEAR TU ID, REVISAR");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Ocurrio algun error general");
            e.printStackTrace();
        }*/
        return plDTO;
    }

    //==== METODOS PRIVADOS ====
    private PlaylistDTO buildDTOPlaylist(Playlist pl) {
        Duration playlistDuration = pl.getPlaylistDuration();
        PlaylistDTO playlistDTO = PlaylistDTO.builder()
                .creationDate(pl.getCreationDate().toString())
                .totalDuration(playlistDuration)
                .tracks(pl.getTracks())
                .name(pl.getName())
                .description(pl.getDescription())
                .build();
        return playlistDTO;
    }

}
