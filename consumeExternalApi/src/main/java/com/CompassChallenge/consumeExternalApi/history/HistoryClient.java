package com.CompassChallenge.consumeExternalApi.history;

import com.CompassChallenge.consumeExternalApi.Post.PostResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "HistoryClient", url = "https://jsonplaceholder.typicode.com")
public interface HistoryClient {

    @GetMapping(value = "/id")
    List<PostResponse> getPostById(@PathVariable("id") Long id);
}


