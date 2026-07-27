package com.cognizant.learn_jwt.controller;

import com.cognizant.learn_jwt.model.AuthenticationResponse;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate() {

        String token = Jwts.builder()
                .setSubject("user")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey1234567890")
                .compact();

        return new AuthenticationResponse(token);
    }
}