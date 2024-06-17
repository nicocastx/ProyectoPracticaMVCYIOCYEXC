package com.springbootapp.proyectopracticamvcyiocyexc.config.serializing.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.Duration;

public class CustomDurationSerializer extends JsonSerializer<Duration> {
    @Override
    public void serialize(Duration duration, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();
        String formatted = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        jsonGenerator.writeString(formatted);
    }
}
