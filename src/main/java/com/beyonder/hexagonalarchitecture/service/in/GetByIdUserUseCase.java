package com.beyonder.hexagonalarchitecture.service.in;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;

public interface GetByIdUserUseCase {
    UserEntity getUserById(int id);
}
