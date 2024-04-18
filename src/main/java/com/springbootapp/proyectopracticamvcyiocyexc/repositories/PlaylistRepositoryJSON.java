package com.springbootapp.proyectopracticamvcyiocyexc.repositories;

import com.springbootapp.proyectopracticamvcyiocyexc.models.Playlist;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.time.Duration;

@Repository
@Primary
public class PlaylistRepositoryJSON implements PlaylistRepository{
    @Override
    public Duration getDuration() {
        return null;
    }

    @Override
    public void getAll() {

    }

    @Override
    public int getById(int id) {
        return 0;
    }

    @Override
    public int add(Playlist playlist) {
        return 0;
    }
}
