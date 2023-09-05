package com.CompassChallenge.consumeExternalApi.Comments;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
@RequiredArgsConstructor
public class CommentsService {

    private final CommentsClient commentsClient;

    public List<CommentsResponse> getPostById(Long id){

        return commentsClient.getPostById(id);
    }
}

