package com.hexagonal.adapters.persistence;

import com.hexagonal.adapters.persistence.jpa.UserJpaRepository;
import com.hexagonal.adapters.persistence.model.UserModel;
import com.hexagonal.core.domain.User;
import com.hexagonal.core.ports.outbound.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserJpaRepository userJpaRepository;

    @Override
    public User save(User user) {
        var userModel = new UserModel(user);
        var saved = userJpaRepository.save(userModel);
        return saved.toDomain();
    }

    @Override
    public List<User> findAll() {
        var list = userJpaRepository.findAll();
        return list.stream().map(user -> user.toDomain()).collect(Collectors.toList());
    }
}
