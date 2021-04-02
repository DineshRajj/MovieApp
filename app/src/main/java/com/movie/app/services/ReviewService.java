/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.app.services;

import com.movie.app.models.Movie;
import com.movie.app.models.Review;
import com.movie.app.repository.ReviewRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dineshkumar.r
 */
@Service
public class ReviewService implements IReviewService{
    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<Review> findByMovie(Movie movie) {
        return reviewRepository.findByMovie(movie);
    }

    @Override
    public Review findById(int id) {
         return reviewRepository.findById(id);
    }

    @Override
    public void save(Review review) {
      reviewRepository.save(review);
    }

    @Override
    public void delete(Review review) {
         reviewRepository.delete(review);
    }
}
