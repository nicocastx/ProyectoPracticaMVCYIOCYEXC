package com.springbootapp.proyectopracticamvcyiocyexc.models.Errors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorTraerPlaylist {
    String message;
    String error;
    Integer statusCode;
    Date date;
}
