/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.app.repository;

import com.movie.app.models.CastAndCrew;
import com.movie.app.models.Movie;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dineshkumar.r
 */
@Repository
public interface CastAndCrewRepository  extends  CrudRepository<CastAndCrew, Integer>{
    
   
    public CastAndCrew findById(int id);
        
   
    
}
