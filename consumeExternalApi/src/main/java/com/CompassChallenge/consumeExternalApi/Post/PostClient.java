package com.CompassChallenge.consumeExternalApi.Post;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//requisição
@FeignClient(name = "PostClient", url = "https://jsonplaceholder.typicode.com/posts")
public interface PostClient {


    @Contract(pure = true)
    @Contract(pure = true)
    static @Nullable @Nullable String callAPI() {
        return null;
    }

    //get by id
    @GetMapping(value = "/id")
    List<PostResponse> getPostById(@PathVariable("id") Long id);

    String createPost();
}
