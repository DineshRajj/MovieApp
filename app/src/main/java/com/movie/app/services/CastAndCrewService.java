/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.app.services;

import com.movie.app.models.CastAndCrew;
import com.movie.app.models.Movie;
import com.movie.app.repository.CastAndCrewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dineshkumar.r
 */
@Service
public class CastAndCrewService implements ICastAndCrewService
{
@Autowired
private CastAndCrewRepository castAndCrewRepository;
    @Override
    public void save(CastAndCrew castAndCrew) {
       castAndCrewRepository.save(castAndCrew);
    }

    @Override
    public CastAndCrew findById(int id) {
        return castAndCrewRepository.findById(id);
    }

    

    @Override
    public void delete(CastAndCrew castAndCrew) {
        castAndCrewRepository.delete(castAndCrew);
    }
    
}
