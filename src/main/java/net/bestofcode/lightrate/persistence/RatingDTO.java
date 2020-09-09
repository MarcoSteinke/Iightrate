package net.bestofcode.lightrate.persistence;

import lombok.AllArgsConstructor;
import net.bestofcode.lightrate.domain.model.Description;
import net.bestofcode.lightrate.domain.model.RatingID;
import net.bestofcode.lightrate.domain.model.Title;

@AllArgsConstructor
public class RatingDTO {

    private final TitleDTO title;
    private final DescriptionDTO description;
    private final RatingID ratingID;
    private Integer count;
    private Double rating;
}
