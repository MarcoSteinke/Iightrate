package net.bestofcode.lightrate.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Rating {

    private final Title title;
    private final Description description;
    private final RatingID ratingID;
    private Integer count;
    private Double rating;
    private final LocalDateTime dateOfCreation;

    public Rating(Title title, Description description) {
        this.title = title;
        this.description = description;
        this.ratingID = new RatingID(UUID.randomUUID());
        this.count = 0;
        this.rating = -1.0;
        this.dateOfCreation = LocalDateTime.now();
    }
}
