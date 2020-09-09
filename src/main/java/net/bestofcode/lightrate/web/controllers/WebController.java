package net.bestofcode.lightrate.web.controllers;

import net.bestofcode.lightrate.domain.model.Description;
import net.bestofcode.lightrate.domain.model.Rating;
import net.bestofcode.lightrate.domain.model.RatingID;
import net.bestofcode.lightrate.domain.model.Title;
import net.bestofcode.lightrate.domain.services.DatabaseService;
import net.bestofcode.lightrate.domain.services.RatingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller
public class WebController {

    DatabaseService databaseService;
    RatingService ratingService;

    public WebController(DatabaseService databaseService, RatingService ratingService) {
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
            model.addAttribute("error", "You have to fill all input fields!");
            return "index";
        }

        // validate and persist the information
        Rating rating = this.ratingService.createRating(
                new Title(title),
                new Description(description)
        );

        model.addAttribute("rating", rating);
        return "redirect:/" + rating.getRatingID().getId().toString();
    }

    @GetMapping("/{id}")
    public String returnRating(Model model, @PathVariable String id) {

        RatingID ratingID;

        try {

            ratingID = new RatingID(UUID.fromString(id));

        } catch (IllegalArgumentException illegalArgumentException) {

            model.addAttribute("error", "The link you requested does not exist!");
            return "index";

        }

        Rating rating = this.databaseService.load(ratingID);

        if (rating != null) {

            model.addAttribute("rating", rating);
            return "rating";

        } else {

            model.addAttribute("error", "The link you requested does not exist!");
            return "index";

        }
    }

    @PostMapping("/{id}")
    public String returnRating(Model model, @PathVariable String id, @RequestParam int star, HttpServletRequest request) {

        RatingID ratingID;

        try {

            ratingID = new RatingID(UUID.fromString(id));

        } catch (IllegalArgumentException illegalArgumentException) {

            model.addAttribute("error", "The link you requested does not exist!");
            return "index";

        }

        Rating rating = this.databaseService.load(ratingID);

        if (rating != null) {

            model.addAttribute("rating", rating);
            return "rating";

        } else {

            model.addAttribute("error", "The link you requested does not exist!");
            return "index";

        }
    }
}
