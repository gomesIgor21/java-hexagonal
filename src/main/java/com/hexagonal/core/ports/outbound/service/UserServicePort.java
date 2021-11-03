package com.hexagonal.core.ports.outbound.service;

import com.hexagonal.core.domain.User;

public interface UserServicePort {
    User save(User user);
}
