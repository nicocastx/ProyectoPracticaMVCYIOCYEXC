package com.springbootapp.proyectopracticamvcyiocyexc.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.springbootapp.proyectopracticamvcyiocyexc.config.serializing.deserializer.CustomDurationDeserializer;
import com.springbootapp.proyectopracticamvcyiocyexc.config.serializing.serializer.CustomDurationSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Track {
    private int id;
    private Artist artist;
    @JsonDeserialize(using = CustomDurationDeserializer.class)
    @JsonSerialize(using = CustomDurationSerializer.class)
    private Duration duration;
    private String name;

}
