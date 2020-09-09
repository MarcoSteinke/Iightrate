package net.bestofcode.lightrate.persistence.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.bestofcode.lightrate.domain.model.RatingID;

@AllArgsConstructor
public class RatingDTO {

    private final TitleDTO title;
    private final DescriptionDTO description;

    @Getter
    private final RatingID ratingID;
    private Integer count;
    private Double rating;
}
