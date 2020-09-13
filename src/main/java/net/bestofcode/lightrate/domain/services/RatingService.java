package net.bestofcode.lightrate.domain.services;

import net.bestofcode.lightrate.domain.model.Description;
import net.bestofcode.lightrate.domain.model.Rating;
import net.bestofcode.lightrate.domain.model.Title;
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

    public void updateRating(Rating rating, int latestRating) {

        Rating rating1 = new Rating(
                rating.getTitle(),
                rating.getDescription(),
                rating.getRatingID(),
                rating.getCount() + 1,
                ((double) rating.getSum() + 1) / ((double) rating.getCount() + 1),
                rating.getSum() + 1,
                rating.getDateOfCreation()
        );

        databaseService.save(rating1);
    }
}
