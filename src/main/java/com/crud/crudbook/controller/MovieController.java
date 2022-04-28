package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Movie;
import com.crud.crudbook.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2")
public class MovieController {

    @Autowired
    private MovieServiceInterface service;

    @GetMapping("get/movies")
    public List<Movie> getAllMovies() {return service.getAllMovies();}

    @PostMapping("save/movie")
    public Movie saveMovie(@RequestBody Movie movie) { return service.saveMovie(movie);}

    @PutMapping("update/movie")
    public Movie updateMovie(@RequestBody Movie movie) {return  service.updateMovie(movie);}

    @DeleteMapping("delete/movie/{id}")
    public void deleteMovie(@PathVariable Long id) { service.deleteMovie(id);}
}
