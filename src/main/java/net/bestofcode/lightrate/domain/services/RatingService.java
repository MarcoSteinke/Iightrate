package net.bestofcode.lightrate.domain.services;

import net.bestofcode.lightrate.persistence.FakeDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {

    private final FakeDatabase fakeDatabase;

    public RatingService(FakeDatabase fakeDatabase) {

        this.fakeDatabase = fakeDatabase;

    }
}
