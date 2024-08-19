package com.example.movie.repo;
// import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.movie.entity.*;
import java.util.List;


public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByNameContaining(String name);
}
