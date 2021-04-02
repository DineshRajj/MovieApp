import React from 'react'

function MovieCard(props) {
  return (
  <div className="row">
  <h1>Movie Name:{props.movie.movieName}</h1>
  <h1>plot:{props.movie.plot}</h1>
  <h1>genre:{props.movie.genre}</h1>
  <h1>releaseDate:{props.movie.releaseDate}</h1>
 <hr/>
   </div>
  );
}

export default MovieCard;
