package com.orion.service;

import com.orion.domain.Movie;
import com.orion.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public Optional<Movie> findById(Long id) {
        return movieRepository.findById(id);
    }

    public Iterable<Movie> findAll() {
        return movieRepository.findAll();
    }

    public List<Movie> getMovieByRateGreaterThan(Integer rate) {
        return movieRepository.findByRateGreaterThan(rate);
    }
}
