package com.orion.controller;

import com.orion.domain.Movie;
import com.orion.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping(value = "/movie")
    public Movie update(@RequestBody Movie movie) {
        Movie movieObj = movieService.findById(movie.getId()).get();
        movieObj.setName(movie.getName());
        movieObj.setRate(movie.getRate());
        movieObj.setYear(movie.getYear());
        return movieService.save(movieObj);
    }

    @PutMapping(value = "/movie")
    public Movie save(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @GetMapping(value = "/movie/{movieId}")
    public Movie getMovie(@PathVariable("movieId") Long movieId) {
        return movieService.findById(movieId).get();
    }

    @GetMapping(value = "/movies")
    public Iterable<Movie> getMovie() {
        return movieService.findAll();
    }

    @GetMapping(value = "/movie/year/{movieYear}")
    public List<Movie> getMoviesByRate(@PathVariable("movieYear") Integer movieYear) {
        return movieService.getMoviesByYear(movieYear);
    }

}
