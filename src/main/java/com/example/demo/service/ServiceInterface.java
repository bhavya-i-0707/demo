package com.example.demo.service;

import com.example.demo.model.Addition;
import org.springframework.http.ResponseEntity;

public interface ServiceInterface {
    public Addition processRequest(Addition addition);
}
