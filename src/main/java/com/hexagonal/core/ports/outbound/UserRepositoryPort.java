package com.hexagonal.core.ports.outbound;

import com.hexagonal.core.domain.User;

import java.util.List;

public interface UserRepositoryPort {
    User save(User user);
    List<User> findAll();
}
