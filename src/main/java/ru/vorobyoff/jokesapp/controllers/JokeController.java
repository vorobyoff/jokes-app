package ru.vorobyoff.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vorobyoff.jokesapp.services.JokeService;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(final JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(final Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}