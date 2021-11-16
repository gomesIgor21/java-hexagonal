package com.hexagonal.adapters.persistence.model;

import com.hexagonal.core.domain.Post;
import com.hexagonal.core.domain.User;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(nullable = false)
    private String username;
    private String password;

    private String nome;

    public UserModel(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.nome = user.getNome();
    }

    public User toDomain() {
        return new User(this.id, this.username, this.password, this.nome);
    }
}
