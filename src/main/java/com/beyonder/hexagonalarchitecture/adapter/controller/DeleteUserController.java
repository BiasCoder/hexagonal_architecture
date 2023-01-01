package com.beyonder.hexagonalarchitecture.adapter.controller;


import com.beyonder.hexagonalarchitecture.entity.UserEntity;
import com.beyonder.hexagonalarchitecture.service.in.DeleteUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class DeleteUserController {
    private final DeleteUserUseCase deleteUserUseCase;
    @DeleteMapping("/{id}")
    public UserEntity deleteUser(@PathVariable("id")int id, @RequestBody UserEntity userEntity){
        deleteUserUseCase.deleteUserById(id);
        return userEntity;
    }

}
