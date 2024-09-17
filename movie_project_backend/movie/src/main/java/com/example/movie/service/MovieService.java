package com.example.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.movie.repo.*;
import com.example.movie.entity.*;
import java.time.LocalDate;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public List<Movie> searchByName(String name) {
        return movieRepository.findByNameContaining(name);
    }

    public List<Movie> getrecentMovies(LocalDate start,LocalDate end){
        return movieRepository.findByReleaseDateBetween(start, end);
    }
}
