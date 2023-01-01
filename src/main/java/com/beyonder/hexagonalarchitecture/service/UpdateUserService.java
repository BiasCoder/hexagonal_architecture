package com.beyonder.hexagonalarchitecture.service;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;
import com.beyonder.hexagonalarchitecture.service.in.UpdateUserUseCase;
import com.beyonder.hexagonalarchitecture.service.out.UpdateUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateUserService implements UpdateUserUseCase {

    private final UpdateUserPort updateUserPort;
    @Override
    public UserEntity updateUser(int id, UserEntity userEntity) {
        return updateUserPort.updateUser(id, userEntity);
    }
}
