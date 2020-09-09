package net.bestofcode.lightrate.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class RatingID {

    private final UUID id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RatingID ratingID = (RatingID) o;

        return id != null ? id.equals(ratingID.id) : ratingID.id == null;
    }

    @Override
    public int hashCode() {
        return this.getId().toString().hashCode();
    }
}
