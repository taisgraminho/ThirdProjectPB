package com.CompassChallenge.consumeExternalApi.Post;

import jakarta.persistence.Id;

public record PostResponse(String response, String message){

    @Id
    private static Long id;
    private static String title;
    private static String body;

    public PostResponse(String response) {
    }

    public static Long getId() {
        return id;
    }

    public static void setId(Long id) {
        PostResponse.id = id;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        PostResponse.title = title;
    }

    public static String getBody() {
        return body;
    }

    public static void setBody(String body) {
        PostResponse.body = body;
    }
}