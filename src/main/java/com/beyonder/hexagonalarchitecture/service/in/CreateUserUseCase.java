package com.beyonder.hexagonalarchitecture.service.in;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;


public interface CreateUserUseCase {
    UserEntity createUser(UserEntity userEntity);
}
