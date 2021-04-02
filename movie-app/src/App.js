import React from 'react'
import logo from './logo.svg';
import './App.css';
import Nav from './Nav'
import AddMovie from './AddMovie'
import DisplayMovie from './DisplayMovie'
import {BrowserRouter as  Router,Switch,Route} from 'react-router-dom'

function App() {
  return (
  <Router>
    <div className="App">
	
   <Nav />
   <Switch>
  <Route path="/" exact component={AddMovie}/>
 
  <Route path="/displayMovie" component={DisplayMovie}/>
  </Switch>
   
    </div>
	 </Router>
  );
}

export default App;
