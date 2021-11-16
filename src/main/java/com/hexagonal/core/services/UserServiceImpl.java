package com.hexagonal.core.services;

import com.hexagonal.core.domain.User;
import com.hexagonal.core.ports.outbound.UserRepositoryPort;
import com.hexagonal.core.ports.inbound.UserServicePort;

import java.util.List;

public class UserServiceImpl implements UserServicePort {

    private final UserRepositoryPort userRepositoryPort;

    public UserServiceImpl(final UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User save(User user){
        return userRepositoryPort.save(user);
    }

    @Override
    public List<User> findAll() { return userRepositoryPort.findAll();}
}
