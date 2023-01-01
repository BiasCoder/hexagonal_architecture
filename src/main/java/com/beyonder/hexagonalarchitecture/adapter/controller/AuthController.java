package com.beyonder.hexagonalarchitecture.adapter.controller;

import com.beyonder.hexagonalarchitecture.dto.LoginRequest;
import com.beyonder.hexagonalarchitecture.dto.TokenResponse;
import com.beyonder.hexagonalarchitecture.entity.UserEntity;
import com.beyonder.hexagonalarchitecture.security.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class AuthController {
    @Autowired
    TokenService tokenService;



    @Autowired
    AuthenticationManager authenticationManager;
    @PostMapping("")
    public ResponseEntity<?> generateToken(@RequestBody LoginRequest req) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        req.getUsername(),
                        req.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = tokenService.generateToken(authentication);
        return ResponseEntity.ok(new TokenResponse(jwt));

    }

}

