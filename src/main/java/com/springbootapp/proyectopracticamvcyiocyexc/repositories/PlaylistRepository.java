package com.springbootapp.proyectopracticamvcyiocyexc.repositories;

import com.springbootapp.proyectopracticamvcyiocyexc.models.Playlist;

import java.time.Duration;

public interface PlaylistRepository extends Repository<Playlist> {
    Duration getDuration();
}
