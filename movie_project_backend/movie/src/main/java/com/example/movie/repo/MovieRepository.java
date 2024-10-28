package com.example.movie.repo;
// import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.movie.entity.*;
import java.util.List;
import java.time.LocalDate;
import org.springframework.data.domain.Sort;


public interface MovieRepository extends JpaRepository<Movie, Long> {
    // @Query("SELECT m,t.dataJson FROM Movie m JOIN m.theaters t WHERE m.name")
    List<Object[]> findByNameContaining(String name);
    

    @Query("SELECT m,t.dataJson FROM Movie m JOIN m.theaters t WHERE m.releaseDate BETWEEN :startDate AND :endDate")
    List<Object[] > findMoviesAndTheatersByReleaseDateBetween(
        @Param("startDate") LocalDate startDate,
        @Param("endDate") LocalDate endDate,
        Sort sort);
    
    List<Movie> findByGenreContaining(String genre);

    // @Query("SELECT m, t.dataJson FROM Movie m JOIN m.theaters t " +
    //         "WHERE t.name LIKE %:theaterName%")
    // List<Object[]> findMoviesByTheaterName(@Param("theaterName") String theaterName);

    // List<Movie> findByReleaseDateBefore(LocalDate date);

    // @Query("SELECT m, t.dataJson FROM Movie m JOIN m.theaters t " +
    //         "WHERE t.city = :city")
    // List<Object[]> findMoviesByCity(@Param("city") String city);

    // List<Movie> findByDirectorContaining(String director);

    
    // List<Movie> findByDurationGreaterThan(int minutes);

    
    // @Query("SELECT m FROM Movie m JOIN m.actors a WHERE a.name LIKE %:actorName%")
    // List<Movie> findMoviesByActorName(@Param("actorName") String actorName);
    
    
}
