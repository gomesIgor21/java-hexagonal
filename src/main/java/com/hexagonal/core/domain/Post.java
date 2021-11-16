package com.hexagonal.core.domain;

import java.util.UUID;

public class Post {

    private UUID id;
    private String post_text;
    private User user_id;

    public Post(UUID id, String post_text, User user_id) {
        this.id = id;
        this.post_text = post_text;
        this.user_id = user_id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPost_text() {
        return post_text;
    }

    public void setPost_text(String post_text) {
        this.post_text = post_text;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }
}
