package com.hexagonal.core.ports.inbound;

import com.hexagonal.core.domain.User;

import java.util.List;

public interface UserServicePort {
    User save(User user);
    List<User> findAll();
}
