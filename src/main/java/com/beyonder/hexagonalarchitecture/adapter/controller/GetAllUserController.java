package com.beyonder.hexagonalarchitecture.adapter.controller;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;
import com.beyonder.hexagonalarchitecture.service.in.GetAllUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class GetAllUserController {

    private final GetAllUserUseCase getAllUserUseCase;
    @GetMapping
    public List<UserEntity> getAllUser() {
        return getAllUserUseCase.getAllUser();
    }
}
