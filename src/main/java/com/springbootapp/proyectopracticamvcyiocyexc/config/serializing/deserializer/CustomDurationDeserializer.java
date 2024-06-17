package com.springbootapp.proyectopracticamvcyiocyexc.config.serializing.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.time.Duration;

public class CustomDurationDeserializer extends JsonDeserializer<Duration> {
    @Override
    public Duration deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String durationString = p.getText();
        // Descomponer el formato "00:03:30"
        String[] parts = durationString.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);

        // Crear el objeto Duration
        return Duration.ofHours(hours).plusMinutes(minutes).plusSeconds(seconds);
    }
}