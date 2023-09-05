package com.CompassChallenge.consumeExternalApi.Post;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;


    @PostMapping("/create")
    public PostResponse createPost() {
        return postService.createPost();
    }
    @GetMapping("/{id}")
    public List<PostResponse> searchById(@PathVariable Long id){
        return postService.getPostById(id);
    }

    @GetMapping("/call-api")
    public PostResponse callAPI() {
        return postService.callAPI();
    }

}

