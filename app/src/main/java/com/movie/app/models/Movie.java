/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.app.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author dineshkumar.r
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Movie")
public class Movie {

    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "movieName")
    private String movieName;

    @Column(name = "plot")
    private String plot;

    @Column(name = "genre")
    private String genre;

    
    @Column(name = "image",columnDefinition = "LONGTEXT")    
    private String image;
    
    @Column(name = "language")
    private String language;
  
    @Column(name = "releaseDate")
    private String releaseDate;

     @OneToOne
      @JoinColumn(name = "cast_id", nullable = true)
      private CastAndCrew cast;
   @Column(name = "overallRating",precision=8, scale=2) 
   private float overallRating;



    
}



