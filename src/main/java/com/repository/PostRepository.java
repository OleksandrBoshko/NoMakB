package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.Post;

public interface PostRepository extends CrudRepository<Post, Integer>{

}
