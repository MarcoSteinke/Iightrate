package net.bestofcode.lightrate.persistence;

import net.bestofcode.lightrate.domain.model.RatingID;
import net.bestofcode.lightrate.persistence.DTO.RatingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class FakeDatabase {

    private final HashMap<RatingID, RatingDTO> database;

    public FakeDatabase() {

        this.database = new HashMap<RatingID, RatingDTO>();

    }

    public void insert(RatingDTO ratingDTO) {

        this.database.put(ratingDTO.getRatingID(), ratingDTO);

    }
}
