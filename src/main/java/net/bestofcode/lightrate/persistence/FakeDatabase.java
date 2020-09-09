package net.bestofcode.lightrate.persistence;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.bestofcode.lightrate.domain.model.RatingID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class FakeDatabase {

    private final HashMap<RatingID, RatingDTO> database;

    public FakeDatabase() {
        this.database = new HashMap<RatingID, RatingDTO>();
    }
}
