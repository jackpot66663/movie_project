package com.example.movie.controller;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.entity.Movie;
import com.example.movie.service.MovieService;
import java.util.List;


@CrossOrigin(origins = "http://localhost:8080")
@RestController

public class MovieController {

    @Autowired

    private MovieService movieService;

    @GetMapping("/findAll")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Movie>> search(@RequestParam String query){
        List<Movie> results = movieService.searchByName(query);
        return new ResponseEntity<>(results, HttpStatus.OK);
    }


}
