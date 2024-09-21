package com.example.movie.controller;

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
import java.time.LocalDate;
import java.util.Set;
import java.util.Map;
// import java.time.format.DateTimeFormatter;
import java.util.HashSet;

@CrossOrigin(origins = "http://localhost:8080")
@RestController

public class MovieController {

    @Autowired

    private MovieService movieService;

    @GetMapping("/findAll")
    public Set<Movie> getAllMovies() {
        List<Movie> allmovies = movieService.getAllMovies();
        Set<Movie> uniqueMovies = new HashSet<>(allmovies);
        return uniqueMovies;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Object []>> search(@RequestParam String query){
        List<Object[]> results = movieService.searchByName(query);
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    // @GetMapping("/recentAll")
    // public List<Movie> recent(){
    //     // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    //     LocalDate end_date = LocalDate.now();
    //     LocalDate start_date = end_date.minusDays(31);
    //     return movieService.getrecentMovies(start_date,end_date);
    // }

    @GetMapping("/release")
    public List<Object[]> getrelease(){
        LocalDate end_date = LocalDate.now();
        LocalDate start_date = end_date.minusDays(31);
        return movieService.getMoviesAndTheatersByReleaseDateRange(start_date,end_date);
    }


}
