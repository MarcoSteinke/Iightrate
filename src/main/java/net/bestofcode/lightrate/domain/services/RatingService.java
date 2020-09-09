package net.bestofcode.lightrate.domain.services;

import net.bestofcode.lightrate.domain.model.Description;
import net.bestofcode.lightrate.domain.model.Rating;
import net.bestofcode.lightrate.domain.model.Title;
import net.bestofcode.lightrate.persistence.FakeDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {

    private final DatabaseService databaseService;

    public RatingService(DatabaseService databaseService) {

        this.databaseService = databaseService;

    }

    public Rating createRating(Title title, Description description) {

        Rating rating = new Rating(title, description);
        this.databaseService.save(rating);

        return rating;
    }
}
