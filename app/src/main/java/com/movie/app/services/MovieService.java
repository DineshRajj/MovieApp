/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.app.services;

import com.movie.app.models.CastAndCrew;
import com.movie.app.models.Movie;
import com.movie.app.repository.MovieRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dineshkumar.r
 */
@Service
public class MovieService implements IMovieService 
{
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie findById(int id) {
        return movieRepository.findById(id);
    }

    @Override
    public Movie findByMovieName(String movieName) {
        return movieRepository.findByMovieName(movieName);
    }

    @Override
    public List<Movie> findAllMovie() {
       return (List<Movie> )movieRepository.findAll();
    }

    @Override
    public void save(Movie movie) {
       movieRepository.save(movie);
    }

    @Override
    public void delete(Movie movie) {
       movieRepository.delete(movie);
    }

    @Override
    public Movie findByCastAndCrew(CastAndCrew castAndCrew) {
       return movieRepository.findByCast(castAndCrew);
    }
  
    
}
