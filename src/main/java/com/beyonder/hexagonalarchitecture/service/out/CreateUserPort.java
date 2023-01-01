package com.beyonder.hexagonalarchitecture.service.out;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;

public interface CreateUserPort {
    UserEntity createUser(UserEntity userEntity);
}
