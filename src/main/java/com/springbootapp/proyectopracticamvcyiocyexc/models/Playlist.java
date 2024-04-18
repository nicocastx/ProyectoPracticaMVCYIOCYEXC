package com.springbootapp.proyectopracticamvcyiocyexc.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Playlist {
    private int id;
    private String name;
    private Date creationDate;
    private String description;
    private List<Track> tracks;


}
