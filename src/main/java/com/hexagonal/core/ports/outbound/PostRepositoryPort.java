package com.hexagonal.core.ports.outbound;

import com.hexagonal.core.domain.Post;

import java.util.List;

public interface PostRepositoryPort {
    Post save(Post post);
    List<Post> findAll();
}
