package net.bestofcode.lightrate.domain.services;

import net.bestofcode.lightrate.domain.model.Description;
import net.bestofcode.lightrate.domain.model.Rating;
import net.bestofcode.lightrate.domain.model.Title;
import net.bestofcode.lightrate.web.security.IP;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicBoolean;

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

        System.out.println(rating.toString());

        Rating rating1 = new Rating(
                rating.getTitle(),
                rating.getDescription(),
                rating.getRatingID(),
                rating.getCount() + 1,
                ((double) rating.getSum() + latestRating) / ((double) rating.getCount() + 1),
                rating.getSum() + latestRating,
                rating.getListOfUsers(),
                rating.getDateOfCreation()
        );

        System.out.println(rating1.toString());

        databaseService.save(rating1);
    }

    public void bindUserIp(Rating rating, IP ip) {
        rating.getListOfUsers().add(ip);
    }

    public boolean isAllowed(Rating rating, IP ip) {

        AtomicBoolean result = new AtomicBoolean(true);

        rating.getListOfUsers().forEach(userIp -> {

            if (userIp.toString().equals(ip.toString())) {
                result.set(false);
            }

        });

        return result.get();

    }
}
