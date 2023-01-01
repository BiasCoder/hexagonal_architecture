package com.beyonder.hexagonalarchitecture.service.out;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;

public interface GetByIdUserPort {
    UserEntity getUserById(int id);
}
