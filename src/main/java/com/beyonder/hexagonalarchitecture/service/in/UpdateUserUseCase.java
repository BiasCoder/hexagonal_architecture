package com.beyonder.hexagonalarchitecture.service.in;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;

public interface UpdateUserUseCase {
    UserEntity updateUser(int id, UserEntity userEntity);
}
