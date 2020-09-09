package net.bestofcode.lightrate.persistence.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.bestofcode.lightrate.domain.model.RatingID;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class RatingDTO {

    private final TitleDTO title;
    private final DescriptionDTO description;

    @Getter
    private final RatingID ratingID;
    private Integer count;
    private Double rating;

    private final LocalDateTime dateOfCreation;
}
