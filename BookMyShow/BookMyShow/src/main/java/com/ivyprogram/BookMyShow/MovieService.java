package com.ivyprogram.BookMyShow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService {
    @Autowired
    private MovieRepo repo;

    public List<Movie> getMovies() {
        return repo.findAll();
    }
}
