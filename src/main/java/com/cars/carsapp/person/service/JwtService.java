package com.cars.carsapp.person.service;

import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    public String extractUsername(String token){
        return null;
    }

    private Claims extractAllClaims(String token){

    }
}
