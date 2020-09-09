package net.bestofcode.lightrate.web.controllers;

import net.bestofcode.lightrate.domain.model.Description;
import net.bestofcode.lightrate.domain.model.Rating;
import net.bestofcode.lightrate.domain.model.Title;
import net.bestofcode.lightrate.domain.services.DatabaseService;
import net.bestofcode.lightrate.domain.services.RatingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LandingPageController {

    DatabaseService databaseService;
    RatingService ratingService;

    public LandingPageController(DatabaseService databaseService, RatingService ratingService) {
        this.databaseService = databaseService;
        this.ratingService = ratingService;
    }

    @GetMapping("/")
    public String returnLandingPage() {
        return "index";
    }

    @PostMapping("/")
    public String createNewRating(Model model, @RequestParam String title, @RequestParam String description) {

        if (title.equals("") || description.equals("")) {
            model.addAttribute("error", "1");
            return "index";
        }

        // validate and persist the information
        Rating rating = this.ratingService.createRating(
                new Title(title),
                new Description(description)
        );

        model.addAttribute("rating", rating);
        return "rating";
    }
}
