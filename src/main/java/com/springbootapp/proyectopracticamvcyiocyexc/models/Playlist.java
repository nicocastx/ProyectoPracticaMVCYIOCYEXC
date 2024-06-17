package com.springbootapp.proyectopracticamvcyiocyexc.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
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

    public Duration getPlaylistDuration(){
        Duration total = Duration.of(0, ChronoUnit.SECONDS);
        for(Track track: this.tracks){
            total = track.getDuration().plus(total);
        }
        return total;
    }


}
