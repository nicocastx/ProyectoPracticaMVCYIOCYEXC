package com.springbootapp.proyectopracticamvcyiocyexc.models.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.springbootapp.proyectopracticamvcyiocyexc.models.Track;
import com.springbootapp.proyectopracticamvcyiocyexc.config.serializing.serializer.CustomDurationSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlaylistDTO {
    private String name;
    private String creationDate;
    private String description;
    private List<Track> tracks;
    @JsonSerialize(using = CustomDurationSerializer.class)
    private Duration totalDuration;
}
