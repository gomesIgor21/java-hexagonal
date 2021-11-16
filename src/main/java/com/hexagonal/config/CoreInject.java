package com.hexagonal.config;

import com.hexagonal.HexagonalApplication;
import com.hexagonal.core.ports.outbound.UserRepositoryPort;
import com.hexagonal.core.ports.inbound.UserServicePort;
import com.hexagonal.core.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalApplication.class)
public class CoreInject {

    @Bean
    UserServicePort userService(UserRepositoryPort repositoryPort) {
        return new UserServiceImpl(repositoryPort);
    }
}
