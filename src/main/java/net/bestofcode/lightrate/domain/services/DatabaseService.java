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

    public DatabaseService(FakeDatabase fakeDatabase) {

        this.fakeDatabase = fakeDatabase;

    }

    public void save(Rating rating) {

        this.fakeDatabase.insert(rating);
    }

    public Rating load(RatingID ratingID) {

        Rating rating = this.fakeDatabase.load(ratingID);

        return rating;

    }
}
