import logo from './logo.svg';
import './App.css';
import GuestPage from './Components/GuestPage';
import UserPage from './Components/UserPage';
import { useState } from 'react';

function App() {
  const [isloggedin, setisloggedin] = useState(false);
  const handlelogin = () => setisloggedin(true);
  const handlelogout = () => setisloggedin(false);
  return (
    <div className="App">
      {isloggedin ? 
        <UserPage onlogout = {handlelogout}/>
      : <GuestPage onlogin = {handlelogin}/>
      }
    </div>
  );
}

export default App;
