package com.beyonder.hexagonalarchitecture.service;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;
import com.beyonder.hexagonalarchitecture.service.in.DeleteUserUseCase;
import com.beyonder.hexagonalarchitecture.service.out.DeleteUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteUserService implements DeleteUserUseCase {
    private final DeleteUserPort deleteUserPort;

    @Override
    public void deleteUserById(int id){
        deleteUserPort.deleteUserById(id);
    }
}