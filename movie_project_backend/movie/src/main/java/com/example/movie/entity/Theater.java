package com.example.movie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Map;


@Entity
@Table(name = "theaters")
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_name", nullable = false)
    private String movieName;

    
    @Column(name = "sessions_json", columnDefinition = "json")
    private String dataJson;

    @ManyToOne
    @JoinColumn(name = "movie_name", referencedColumnName = "name", insertable = false, updatable = false)
    private Movie movie;

    public String getmovieName(){
        return movieName;
    }

    public void setmovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDataJson() {
        return dataJson;
    }

    public void setDataJson(String dataJson) {
        this.dataJson = dataJson;
    }
}
