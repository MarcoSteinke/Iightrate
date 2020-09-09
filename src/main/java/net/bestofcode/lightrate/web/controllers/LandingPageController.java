package net.bestofcode.lightrate.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LandingPageController {

    @GetMapping("/")
    public String returnLandingPage() {
        return "index";
    }

    @PostMapping("/")
    public String createNewRating(Model model, @RequestParam String title, @RequestParam String description) {

    }
}
