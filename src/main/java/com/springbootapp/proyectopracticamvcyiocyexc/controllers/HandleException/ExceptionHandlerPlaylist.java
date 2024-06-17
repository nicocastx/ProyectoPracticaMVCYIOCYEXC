package com.springbootapp.proyectopracticamvcyiocyexc.controllers.HandleException;

import com.springbootapp.proyectopracticamvcyiocyexc.Exceptions.NoExisteElementoException;
import com.springbootapp.proyectopracticamvcyiocyexc.models.Errors.ErrorTraerPlaylist;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
import java.util.HashMap;

@RestControllerAdvice
public class ExceptionHandlerPlaylist {
    @ExceptionHandler(NoExisteElementoException.class)
        private ResponseEntity<?> NoHayElementoId(Exception e){
        ErrorTraerPlaylist err = ErrorTraerPlaylist.builder()
                .date(new Date())
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .error("REVISA TUS DATOS DE ID: Si es un numero")
                .message(e.getMessage())
                .build();
            return ResponseEntity.internalServerError().body(err);
        }

}
