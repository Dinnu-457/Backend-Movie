package com.ivyprogram.BookMyShow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/Movies")
public class MovieController {


    @Autowired
    private MovieService movie_service;

    @GetMapping("/getMovies")
    public List<Movie> getDetails() {
        return movie_service.getMovies();
    }

}
