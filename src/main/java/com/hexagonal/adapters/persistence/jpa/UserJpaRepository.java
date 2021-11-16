package com.hexagonal.adapters.persistence.jpa;

import com.hexagonal.adapters.persistence.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserJpaRepository extends JpaRepository<UserModel, UUID> {
}
