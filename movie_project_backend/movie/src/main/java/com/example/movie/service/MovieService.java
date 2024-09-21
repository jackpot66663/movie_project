package com.example.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.movie.repo.*;
import org.springframework.data.domain.Sort;

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

    public List<Object[]> searchByName(String name) {
        // List<Movie> tests = movieRepository.findByNameContaining(name);
        // for (Movie movie : tests) {
        //     System.out.println(movie.getMoviePicture());
        // }
        return movieRepository.findByNameContaining(name);
    }

    
    // public List<Movie> getrecentMovies(LocalDate start,LocalDate end){
    //     return movieRepository.findByReleaseDateBetween(start, end,Sort.by(Sort.Direction.DESC, "releaseDate"));
    // }

    public List<Object[] > getMoviesAndTheatersByReleaseDateRange(LocalDate startDate, LocalDate endDate) {
        return movieRepository.findMoviesAndTheatersByReleaseDateBetween(startDate, endDate, Sort.by(Sort.Direction.DESC, "releaseDate"));
    }
}
