package com.beyonder.hexagonalarchitecture.adapter.controller;


import com.beyonder.hexagonalarchitecture.entity.UserEntity;
import com.beyonder.hexagonalarchitecture.service.in.GetByIdUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class GetByIdController {
    private final GetByIdUserUseCase getByIdUserUseCase;

    @GetMapping("/{id}")
    public UserEntity getById(@PathVariable("id") int id, @RequestBody UserEntity userEntity){
        return getByIdUserUseCase.getUserById(id);
    }
}
