package com.hexagonal.adapters.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class ApiResponseError {

    private Instant timestamp;
    private int status;
    private String message;
    private String path;



}
