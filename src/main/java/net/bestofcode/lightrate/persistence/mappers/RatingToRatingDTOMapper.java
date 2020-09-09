package net.bestofcode.lightrate.persistence.mappers;

import lombok.NoArgsConstructor;
import net.bestofcode.lightrate.domain.model.Description;
import net.bestofcode.lightrate.domain.model.Rating;
import net.bestofcode.lightrate.domain.model.Title;
import net.bestofcode.lightrate.persistence.DTO.DescriptionDTO;
import net.bestofcode.lightrate.persistence.DTO.RatingDTO;
import net.bestofcode.lightrate.persistence.DTO.TitleDTO;

@NoArgsConstructor
public class RatingToRatingDTOMapper {

    public Rating mapToRating(RatingDTO ratingDTO) {
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
                new TitleDTO(rating.getTitle().getTitleContent()),
                new DescriptionDTO(rating.getDescription().getDescriptionContent()),
                rating.getRatingID(),
                rating.getCount(),
                rating.getRating(),
                rating.getDateOfCreation()
        );

        return ratingDTO;
    }
}
