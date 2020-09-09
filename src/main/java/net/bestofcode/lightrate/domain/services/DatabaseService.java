package net.bestofcode.lightrate.domain.services;

import net.bestofcode.lightrate.domain.model.Rating;
import net.bestofcode.lightrate.domain.model.RatingID;
import net.bestofcode.lightrate.persistence.DTO.RatingDTO;
import net.bestofcode.lightrate.persistence.FakeDatabase;
import net.bestofcode.lightrate.persistence.mappers.RatingMapper;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    private final FakeDatabase fakeDatabase;
    private final RatingMapper ratingMapper;

    public DatabaseService(FakeDatabase fakeDatabase, RatingMapper ratingMapper) {

        this.fakeDatabase = fakeDatabase;
        this.ratingMapper = new RatingMapper();

    }

    public void save(Rating rating) {

        RatingDTO ratingDTO = this.ratingMapper.mapToRatingDTO(rating);
        this.fakeDatabase.insert(ratingDTO);
    }

    public Rating load(RatingID ratingID) {

        RatingDTO ratingDTO = this.fakeDatabase.load(ratingID);

        return this.ratingMapper.mapToRating(ratingDTO);

    }
}
