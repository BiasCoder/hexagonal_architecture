package com.beyonder.hexagonalarchitecture.security;

import com.beyonder.hexagonalarchitecture.adapter.persistence.UserRepository;
import com.beyonder.hexagonalarchitecture.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserPrincipalService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserPrincipal loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username).orElseThrow(()->  new UsernameNotFoundException("User not found " + username));
        return UserPrincipal.create(user);
    }
    @Transactional
    public UserPrincipal loadUserById(int id) {
        UserEntity user = userRepository.findById(id).orElseThrow(
                () -> new UsernameNotFoundException("User not found with id : " + id)
        );

        return UserPrincipal.create(user);
    }

}
