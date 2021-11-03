package com.hexagonal.core.services;

import com.hexagonal.core.domain.User;
import com.hexagonal.core.ports.outbound.repository.UserRepositoryPort;
import com.hexagonal.core.ports.outbound.service.UserServicePort;

public class UserServiceImpl implements UserServicePort {

    private final UserRepositoryPort userRepositoryPort;

    public UserServiceImpl(final UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User save(User user){
        return userRepositoryPort.save(user);
    }
}
