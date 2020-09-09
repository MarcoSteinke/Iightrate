package net.bestofcode.lightrate.persistence;

import net.bestofcode.lightrate.domain.model.Rating;
import net.bestofcode.lightrate.domain.model.RatingID;
import net.bestofcode.lightrate.persistence.DTO.RatingDTO;
import net.bestofcode.lightrate.persistence.mappers.RatingMapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class FakeDatabase {

    private final HashMap<RatingID, RatingDTO> database;

    private final RatingMapper ratingMapper;

    public FakeDatabase() {

        this.database = new HashMap<RatingID, RatingDTO>();
        this.ratingMapper = new RatingMapper();
    }

    public void insert(Rating rating) {

        RatingDTO ratingDTO = this.ratingMapper.mapToRatingDTO(rating);
        this.database.put(ratingDTO.getRatingID(), ratingDTO);

        System.out.println(
                ratingDTO.getRatingID().getId().toString()
        );

    }

    public Rating load(RatingID ratingID) {

        RatingDTO ratingDTO = this.database.get(ratingID);

        return this.ratingMapper.mapToRating(ratingDTO);

    }
}
