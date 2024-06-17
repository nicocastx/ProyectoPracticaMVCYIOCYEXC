package com.springbootapp.proyectopracticamvcyiocyexc.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbootapp.proyectopracticamvcyiocyexc.Exceptions.NoExisteElementoException;
import com.springbootapp.proyectopracticamvcyiocyexc.models.Playlist;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
@Primary
public class PlaylistRepositoryJSON implements PlaylistRepository{
    private Logger logger = LoggerFactory.getLogger(PlaylistRepositoryJSON.class);
    private List<Playlist> playlists;
    //@Value()
    @Value("${playlist.names}")
    private String listPlaylistNames;

    public PlaylistRepositoryJSON(){

    }


    @PostConstruct
    private void llenarDatos(){
        try {
            List<String> arrayNames = Arrays.stream(listPlaylistNames.split(",")).map(String::trim).toList();
            ObjectMapper objectMapper = new ObjectMapper();
            //File jsonFile = new File("data/playlists.json");
            //InputStream jsonStream = Main.class.getResourceAsStream("data/playlists.json");
            ClassPathResource path = new ClassPathResource("/data/playlists.json");
            Playlist[] playlistsArray = objectMapper.readValue(path.getFile(), Playlist[].class);
            this.playlists = Arrays.stream(playlistsArray).toList();
            for(int i = 0; i < playlistsArray.length; i++){
                playlistsArray[i].setName(arrayNames.get(i));
            }
        }catch(Exception e){
            logger.error("[ERROR REPOSITORY] OCURRIO UN ERROR AL TRAER LOS DATOS");
            logger.error(e.getMessage());
        }
    }

    @Override
    public List<Playlist> getAll() {
        return playlists;
    }

    @Override
    public Playlist getById(int id) throws NoExisteElementoException{
        try {
            Playlist pl = playlists.get(id - 1);
            return pl;
        } catch (Exception e){
            throw new NoExisteElementoException("Ocurrio un problema con tu busqueda de ID de playlist");
        }
    }

    @Override
    public int add(Playlist playlist) {
        return 0;
    }

}


