package com.hexagonal.core.domain;

import java.util.UUID;

public class User {

    private UUID id;
    private String username;
    private String password;
    private String nome;

    public User(UUID id, String username, String password, String nome) {
        this.id = id;
        setUsername(username);
        setPassword(password);
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username == null || username.isBlank()){
            throw new IllegalArgumentException("Username can not be null or empty");
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password == null || password.isBlank()){
            throw new IllegalArgumentException("Password can not be null or empty");
        }
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
