package com.hexagonal.core.ports.outbound.service;

import com.hexagonal.core.domain.Post;

import java.util.List;

public interface PostServicePort {
    Post save(Post post);
    List<Post> findAll();
}
