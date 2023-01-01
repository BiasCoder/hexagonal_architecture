package com.beyonder.hexagonalarchitecture.service;

import com.beyonder.hexagonalarchitecture.entity.UserEntity;

import com.beyonder.hexagonalarchitecture.service.in.GetByIdUserUseCase;
import com.beyonder.hexagonalarchitecture.service.out.GetByIdUserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@RequiredArgsConstructor
public class GetByIdUserService implements GetByIdUserUseCase {
    private final GetByIdUserPort getByIdUserPort;
    @Override
    public UserEntity getUserById(@PathVariable("id") int id) {
        return getByIdUserPort.getUserById(id);
    }
}
