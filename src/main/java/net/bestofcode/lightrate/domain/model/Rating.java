package net.bestofcode.lightrate.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
@ToString
public class Rating {

    private final Title title;
    private final Description description;
    private final RatingID ratingID;
    private Integer count;
    private Double rating;
    private Integer sum;
    private final LocalDateTime dateOfCreation;

    public Rating(Title title, Description description) {
        this.title = title;
        this.description = description;
        this.ratingID = new RatingID(UUID.randomUUID());
        this.count = 0;
        this.rating = -1.0;
        this.sum = 0;
        this.dateOfCreation = LocalDateTime.now();

        System.out.println("vor mapping: " + this.ratingID.getId().toString());
    }

    public int getRatingAsInt() {
        return (int) Math.floor(this.rating);
    }
}
