package com.CompassChallenge.consumeExternalApi.Comments;

import jakarta.persistence.Id;

public record CommentsResponse() {

    @Id
    private static Long id;
    private static String getBody;

}
