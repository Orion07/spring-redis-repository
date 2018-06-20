package com.orion.repository;

import com.orion.domain.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    List<Movie> findByRateGreaterThan(Integer rate);
}
