package com.CompassChallenge.consumeExternalApi.Post;

import com.CompassChallenge.consumeExternalApi.history.HistoryService;
import com.CompassChallenge.consumeExternalApi.history.StatusHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostClient postClient;
    private final HistoryService historyService;
  

    public List<PostResponse> getPostById(Long id){

        return postClient.getPostById(id);
    }

    @Autowired
    public PostService(PostClient postClient, HistoryService historyService) {
        this.postClient = postClient;
        this.historyService = historyService;
    }


    public PostResponse callAPI() {
        try {

            String response = PostClient.callAPI();

            // Verifique se o post foi encontrado (defina sua própria lógica de verificação)
            boolean findPost = verifyPost(response);

            //if everything okay return
            if (findPost) {
                historyService.registerStatus(StatusHistory.valueOf("POST_FIND"));
            }

            return new PostResponse(response);
        } catch (Exception e) {
            return new PostResponse("We have a problem", e.getMessage());
        }
    }

    public PostResponse createPost() {
        try {
            // searching for postClient
            String response= postClient.createPost();

            // success created
            historyService.registerStatus(StatusHistory.CREATED);

            return new PostResponse(response, e.getMessage());
        } catch (Exception e) {
            // if something gonna being wrong
            historyService.registerStatus(StatusHistory.FAILED);
            return new PostResponse("We have a problem!", e.getMessage());
        }
    }

    private boolean verifyPost(String response) {
        if(response > 0 || 100 >= response){
            return Boolean.parseBoolean(response = String.valueOf(true));
        }
        return false;
    }
}










