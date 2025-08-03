import logo from './logo.svg';
import './App.css';
import Bookdetails from './Components/Bookdetails';
import Blogdetails from './Components/Blogdetails';
import Coursedetails from './Components/Coursedetails';
import { useState } from 'react';

function App() {
  const [activecom, setactivecom] = useState("")
  const [isloggedin, setisloggedin] = useState("true")
  return (
    <div className='Main'>
      <select className ="dropdown"onChange={(e) => setactivecom(e.target.value)} value={activecom}>
        <option value="book">Book</option>
        <option value="blog">Blog</option>
        <option value="course">Course</option>
      </select>
      <br></br>
      {(() => {
        if(activecom === "book") return <Bookdetails/>;
        if(activecom === "course") return <Coursedetails/>;
        if(activecom === "blog") return <Blogdetails/>
      })()}
    </div>
  );
}

export default App;
