package com.beyonder.hexagonalarchitecture.service.out;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;

import java.util.List;

public interface GetAllUserPort {
    List<UserEntity> getAllUser();
}
