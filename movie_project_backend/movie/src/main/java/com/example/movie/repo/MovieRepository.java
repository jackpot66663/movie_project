package com.example.movie.repo;
// import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.movie.entity.*;
import java.util.List;
import java.time.LocalDate;


public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByNameContaining(String name);
    List<Movie> findByReleaseDateBetween(LocalDate start, LocalDate end);
}
