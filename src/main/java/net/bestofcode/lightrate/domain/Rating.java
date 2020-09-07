package net.bestofcode.lightrate.domain;

import lombok.AllArgsConstructor;

import java.util.UUID;

public class Rating {

    private final Title title;
    private final Description description;
    private final RatingID ratingID;

    public Rating(Title title, Description description) {
        this.title = title;
        this.description = description;
        this.ratingID = new RatingID(UUID.randomUUID());
    }
}
