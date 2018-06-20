package com.orion.controller;

import com.orion.domain.Movie;
import com.orion.service.MovieService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PutMapping(value = "/movie")
    public String save(@RequestBody Movie movie) {
        Movie savedMovie = movieService.save(movie);
        System.out.println(savedMovie);
        return savedMovie.getId() != null ? "OK" : "Not saved";
    }

    @GetMapping(value = "/movie/{movieId}")
    public Movie getMovie(@PathVariable("movieId") Long movieId) {
        return movieService.findById(movieId).get();
    }

    @GetMapping(value = "/movies")
    public Iterable<Movie> getMovie() {
        return movieService.findAll();
    }

}
