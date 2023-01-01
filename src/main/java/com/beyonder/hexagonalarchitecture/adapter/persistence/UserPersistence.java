package com.beyonder.hexagonalarchitecture.adapter.persistence;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;
import com.beyonder.hexagonalarchitecture.service.out.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserPersistence implements GetAllUserPort, CreateUserPort, UpdateUserPort, DeleteUserPort, GetByIdUserPort {
    private final UserRepository userRepository;

    @Override
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }


    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity updateUser(int id, UserEntity userEntity) {
        userEntity.setId(id);
        return userRepository.save(userEntity);
    }


    @Override
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserEntity getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
