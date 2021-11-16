package com.hexagonal.core.ports.inbound;

import com.hexagonal.core.domain.Post;

import java.util.List;

public interface PostServicePort {
    Post save(Post post);
    List<Post> findAll();
}
