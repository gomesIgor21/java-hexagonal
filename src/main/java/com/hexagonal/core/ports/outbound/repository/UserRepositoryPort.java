package com.hexagonal.core.ports.outbound.repository;

import com.hexagonal.core.domain.User;

public interface UserRepositoryPort {
    User save(User user);
}
