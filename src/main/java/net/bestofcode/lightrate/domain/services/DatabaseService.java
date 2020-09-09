package net.bestofcode.lightrate.domain.services;

import net.bestofcode.lightrate.domain.model.Rating;
import net.bestofcode.lightrate.domain.model.RatingID;
import net.bestofcode.lightrate.persistence.DTO.RatingDTO;
import net.bestofcode.lightrate.persistence.FakeDatabase;
import net.bestofcode.lightrate.persistence.mappers.RatingToRatingDTOMapper;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    private final FakeDatabase fakeDatabase;
    private final RatingToRatingDTOMapper ratingToRatingDTOMapper;

    public DatabaseService(FakeDatabase fakeDatabase, RatingToRatingDTOMapper ratingToRatingDTOMapper) {

        this.fakeDatabase = fakeDatabase;
        this.ratingToRatingDTOMapper = new RatingToRatingDTOMapper();

    }

    public void save(Rating rating) {

        RatingDTO ratingDTO = this.ratingToRatingDTOMapper.mapToRatingDTO(rating);
        this.fakeDatabase.insert(ratingDTO);
    }

    public Rating load(RatingID ratingID) {

        RatingDTO ratingDTO = this.fakeDatabase.load(ratingID);

        return this.ratingToRatingDTOMapper.mapToRating(ratingDTO);

    }
}
