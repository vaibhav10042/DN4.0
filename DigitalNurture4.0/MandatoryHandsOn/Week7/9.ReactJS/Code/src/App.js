import logo from './logo.svg';
import './App.css';
import { useState } from 'react'
import ListOfPlayers from './Components/ListOfPlayers';
import IndianPlayers from './Components/IndianPlayers';

function App() {
  const [flag, setflag] = useState(true);
  const toggleComponent = () => {
    setflag(prev => !prev);
  }
  return (
    <div >
      <h1>Cricket App</h1>
      <button onClick={toggleComponent}>
        {flag ? 'Show IndianPlayers' : 'Show ListOfPlayers'}
      </button>
      {flag ? <ListOfPlayers/> : <IndianPlayers/>}
    </div>
  );
}

export default App;
