package net.bestofcode.lightrate.persistence.mappers;

import lombok.NoArgsConstructor;
import net.bestofcode.lightrate.domain.model.Description;
import net.bestofcode.lightrate.domain.model.Rating;
import net.bestofcode.lightrate.domain.model.Title;
import net.bestofcode.lightrate.persistence.DTO.DescriptionDTO;
import net.bestofcode.lightrate.persistence.DTO.RatingDTO;
import net.bestofcode.lightrate.persistence.DTO.TitleDTO;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class RatingMapper {

    public Rating mapToRating(RatingDTO ratingDTO) {

        if (ratingDTO == null) {

            return null;

        }

        Rating rating = new Rating(
                new Title(ratingDTO.getTitle().getTitleContent()),
                new Description(ratingDTO.getDescription().getDescriptionContent()),
                ratingDTO.getRatingID(),
                ratingDTO.getCount(),
                ratingDTO.getRating(),
                ratingDTO.getDateOfCreation()
        );

        return rating;
    }

    public RatingDTO mapToRatingDTO(Rating rating) {

        RatingDTO ratingDTO = new RatingDTO(
                new TitleDTO(rating.getTitle().getContent()),
                new DescriptionDTO(rating.getDescription().getContent()),
                rating.getRatingID(),
                rating.getCount(),
                rating.getRating(),
                rating.getDateOfCreation()
        );

        return ratingDTO;
    }
}
