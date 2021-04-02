/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.app.services;

import com.movie.app.models.CastAndCrew;
import com.movie.app.models.Movie;

/**
 *
 * @author dineshkumar.r
 */
public interface ICastAndCrewService {
    public void save(CastAndCrew castAndCrew);
    public CastAndCrew findById(int id);
   
     public void delete(CastAndCrew castAndCrew);
    
}
