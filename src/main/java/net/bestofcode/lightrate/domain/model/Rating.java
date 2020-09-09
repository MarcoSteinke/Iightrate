package net.bestofcode.lightrate.domain.model;

import java.util.UUID;

public class Rating {

    private final Title title;
    private final Description description;
    private final RatingID ratingID;
    private Integer count;
    private Double rating;

    public Rating(Title title, Description description) {
        this.title = title;
        this.description = description;
        this.ratingID = new RatingID(UUID.randomUUID());
        this.count = 0;
        this.rating = -1.0;
    }
}
