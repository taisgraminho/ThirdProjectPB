package com.CompassChallenge.consumeExternalApi.history;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/history")
public class HistoryController {

    private final HistoryController historyService;

    @GetMapping("/{id}")
    public List<HistoryResponse> searchById(@PathVariable Long id){
        return historyService.getPostById(id);
    }

    private List<HistoryResponse> getPostById(Long id) {

        return null;
    }



}
