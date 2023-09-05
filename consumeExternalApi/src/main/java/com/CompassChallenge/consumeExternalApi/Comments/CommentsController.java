package com.CompassChallenge.consumeExternalApi.Comments;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/comments")
public class CommentsController {


    private final CommentsService CommentsService;

    @GetMapping("/{id}")
    public List<CommentsResponse> searchById(@PathVariable Long id){
        return CommentsService.getPostById(id);
    }

}
