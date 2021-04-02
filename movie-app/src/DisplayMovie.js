import React from 'react'
import MovieCard from './MovieCard'
import axios from 'axios';

function DisplayMovie() {
	const [result, setResult] = React.useState([]);
            React.useEffect(async () => {
                const res = await axios('http://localhost:8080/reviewapp/getAllMovies', ).catch(err => {
                    // what now?
                    console.log(err);
                });
                console.log(JSON.stringify(res.data));
                setResult(res.data);

            }, []);
	
  return (
  
    <div className="App">
	{result.map(response=>
	
	(
	<MovieCard movie={response}/>
	
	)
	
	)
		
		
		
	}
    
    </div>
  );
}

export default DisplayMovie;
