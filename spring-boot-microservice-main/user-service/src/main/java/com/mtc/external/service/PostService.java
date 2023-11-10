package com.mtc.external.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mtc.entities.Post;

import java.util.List;

@FeignClient(name = "POST-SERVICE")
public interface PostService {

    @GetMapping("api/v1/posts/users/{id}")
    List<Post> getPostsByUserId(@PathVariable String id);
}
