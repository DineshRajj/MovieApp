import React from 'react'
import './App.css';
import {BrowserRouter as  Router,Switch,Route,Link} from 'react-router-dom'
function Nav() {
  return (
    <nav>
	<h1>Movie App</h1>
	<ul className="nav-links">
	<Link to="/"><li>AddMovie</li></Link>
	<Link to="/displayMovie"><li>Show Moives</li></Link>
	
	

	</ul>
	</nav>
  );
}

export default Nav;
