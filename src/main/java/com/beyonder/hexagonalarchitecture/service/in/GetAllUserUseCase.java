package com.beyonder.hexagonalarchitecture.service.in;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;

import java.util.List;

public interface GetAllUserUseCase {
    List<UserEntity> getAllUser();
}
