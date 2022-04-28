package com.crud.crudbook.service;

import com.crud.crudbook.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {

    List<Movie> getAllMovies();

    Movie saveMovie(Movie movie);

    Movie updateMovie(Movie movie);

    void deleteMovie(Long id);
}
