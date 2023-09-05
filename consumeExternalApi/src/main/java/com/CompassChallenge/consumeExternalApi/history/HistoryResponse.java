package com.CompassChallenge.consumeExternalApi.history;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record HistoryResponse() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private static Long id;
    private static String status;
    private static LocalDateTime dataRegistro;
}

