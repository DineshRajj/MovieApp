/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.app.controller;
import com.movie.app.models.Movie;
import com.movie.app.services.ICastAndCrewService;
import com.movie.app.services.IMovieService;
import com.movie.app.services.IReviewService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dineshkumar.r
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/reviewapp")
public class MoiveAppController {
@Autowired
private IMovieService iMovieService;
@Autowired
private IReviewService iReviewService;
@Autowired
private ICastAndCrewService iCastAndCrewService;
    
    @PostMapping("/createMovie")
	public ResponseEntity<Movie> createTutorial(@RequestBody Movie movie) {
		try {
                       iCastAndCrewService.save(movie.getCast());
                        iMovieService.save(movie);
                        System.out.println("......tetstststshsh...........");
                        return new ResponseEntity<>(movie, HttpStatus.CREATED);
                    }
                    
			
		 catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
        
        @GetMapping("/movies/{id}")
	public ResponseEntity<Movie> getmovieById(@PathVariable("id") int id) {
		Movie movieData = iMovieService.findById(id);

		if (movieData!=null) {
			return new ResponseEntity<>(movieData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
        
    @GetMapping("/getAllMovies")
	public ResponseEntity<List<Movie>> getAllMovies() {
		try {
			List<Movie> movieList=iMovieService.findAllMovie();
			
			
			if (movieList.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(movieList, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
