package com.hexagonal.core.services;

import com.hexagonal.core.domain.Post;
import com.hexagonal.core.ports.outbound.repository.PostRepositoryPort;
import com.hexagonal.core.ports.outbound.service.PostServicePort;

import java.util.List;

public class PostServiceImpl implements PostServicePort {

    private final PostRepositoryPort postRepositoryPort;

    public PostServiceImpl(final PostRepositoryPort postRepositoryPort){
        this.postRepositoryPort = postRepositoryPort;
    }

    @Override
    public Post save(Post post) {
        return postRepositoryPort.save(post);
    }

    @Override
    public List<Post> findAll() {
        return postRepositoryPort.findAll();
    }
}
