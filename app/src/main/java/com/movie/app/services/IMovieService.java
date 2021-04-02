/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.app.services;

import com.movie.app.models.CastAndCrew;
import com.movie.app.models.Movie;
import java.util.List;
/**
 *
 * @author dineshkumar.r
 */
public interface IMovieService {
      public Movie findById(int id);
      public Movie findByMovieName(String movieName);
      public List<Movie> findAllMovie();
      public void save(Movie movie);
      public void delete(Movie movie);
      public Movie findByCastAndCrew(CastAndCrew castAndCrew);
}
