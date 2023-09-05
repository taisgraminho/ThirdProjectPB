package com.CompassChallenge.consumeExternalApi.history;

import com.CompassChallenge.consumeExternalApi.Post.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoryService {


    private final HistoryClient historyClient;

    public List<PostResponse> getPostById(Long id){

        return historyClient.getPostById(id);
    }

    public void registerStatus(StatusHistory statusHistory) {
    }

}