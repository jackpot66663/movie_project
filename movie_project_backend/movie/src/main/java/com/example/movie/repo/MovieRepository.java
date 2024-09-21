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
    // List<Movie> findByReleaseDateBetween(LocalDate start, LocalDate end,Sort sort);

    @Query("SELECT m,t.dataJson FROM Movie m JOIN m.theaters t WHERE m.releaseDate BETWEEN :startDate AND :endDate")
    List<Object[] > findMoviesAndTheatersByReleaseDateBetween(
        @Param("startDate") LocalDate startDate,
        @Param("endDate") LocalDate endDate,
        Sort sort);
}
