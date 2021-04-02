import React from 'react'
import axios from 'axios';
import './App.css';
import {BrowserRouter as  Router,Switch,Route,Link} from 'react-router-dom'
class AddMovie extends React.Component
{
	
	constructor()
	{
		super()
		
		this.state={
			isLoading:false,
			movieName: "",
			plot: "",
			genre: "",
			language: "",
			releaseDate: "",
			cast:{
				maleLead:"",
				femaleLead:"",
				antoganist:"",
				musicDirector:"",
				dop:""
				
			}
		}
		this.handleChange=this.handleChange.bind(this);
		this.handleSubmit=this.handleSubmit.bind(this);
		
	}
	handleChange(event)
	{
		const {name,value}=event.target
		this.setState({
			
		[name]: value 
			
		})
		
		
	}

async handleSubmit(event)
	{
		//event.preventDefault();
this.setState({isLoading:true});
        const payload = {
        movieName: this.state.movieName,
			plot: this.state.plot,
			genre: this.state.genre,
			language: this.state.language,
			releaseDate: this.state.releaseDate,
			cast:{
				maleLead: this.state.maleLead, 
				femaleLead: this.state.femaleLead,
				antoganist: this.state.antoganist,
				musicDirector: this.state.musicDirector,
			dop:this.state.dop}
				
        };
        this.setState({isLoading:true});
        const resp = await axios.post('http://localhost:8080/reviewapp/createMovie', payload);
               alert(JSON.stringify(resp.data));

this.setState({isLoading:false});

	}	
	render()
	{
		return(
		<div>
		<h1>Add Movie</h1>
	<form  className="add-movie">
	<input type="text" name="movieName" value={this.state.movieName} placeholder="Movie Name" onChange={this.handleChange} /> <br/>  <br/>
	<input type="text" name="plot" value={this.state.plot} placeholder="Plot" onChange={this.handleChange} /> <br/>  <br/>
	<input type="text" name="genre" value={this.state.genre} placeholder="Genre" onChange={this.handleChange} /> <br/>  <br/>
	<input type="text" name="releaseDate" value={this.state.releaseDate} placeholder="Release Date" onChange={this.handleChange} /> <br/> <br/>
	<input type="text" value={this.state.language} name="language" onChange={this.handleChange} placeholder="Language" /> <br/> <br/>
	<input type="text" value={this.state.maleLead} name="maleLead" onChange={this.handleChange} placeholder="Male Lead" /> <br/> <br/>
	<input type="text" value={this.state.femaleLead} name="femaleLead" onChange={this.handleChange} placeholder="Female Lead" /> <br/> <br/>
	<input type="text" value={this.state.musicDirector} name="musicDirector" onChange={this.handleChange} placeholder="Music Director" /> <br/> <br/>
	<input type="text" value={this.state.dop} name="dop" onChange={this.handleChange} placeholder="dop" /> <br/> <br/>
	<input type="text" value={this.state.antoganist} name="antoganist" onChange={this.handleChange} placeholder="Antoganist" /> <br/> <br/>
	<Link to="/displayMovie"><button onClick={this.handleSubmit}>Submit</button></Link>
	</form>

	</div>
	);

		
		
	}
	
}

export default AddMovie