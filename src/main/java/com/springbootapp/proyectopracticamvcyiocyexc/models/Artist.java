package com.springbootapp.proyectopracticamvcyiocyexc.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Artist {
    private int id;
    private String name;
    private String country;
    private String description;
}
