package com.beyonder.hexagonalarchitecture.service.out;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;

public interface UpdateUserPort {
    UserEntity updateUser(int id, UserEntity userEntity);

}
