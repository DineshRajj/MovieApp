/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.app.repository;

import com.movie.app.models.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.movie.app.models.Review;
import java.util.List;

/**
 *
 * @author dineshkumar.r
 */
@Repository
public interface ReviewRepository extends  CrudRepository<Review, Integer> {
    
   public List<Review> findByMovie(Movie movie);
    public Review findById(int id);
 
    
}
