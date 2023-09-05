package com.CompassChallenge.consumeExternalApi.Comments;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CommentClient", url = "https://jsonplaceholder.typicode.com/comments/%s")
public interface CommentsClient {

    //get by id

    @GetMapping(value = "/{id}")
    List<CommentsResponse> getPostById(@PathVariable("id") Long id);
}
