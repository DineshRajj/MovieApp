/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.app.services;

import com.movie.app.models.Movie;
import com.movie.app.models.Review;
import java.util.List;

/**
 *
 * @author dineshkumar.r
 */
public interface IReviewService {
    
    public List<Review> findByMovie(Movie movie);
    public Review findById(int id);
    public void save(Review review);
    public void delete(Review review);
}
