import React, { useState } from 'react'

const IncDec = () => {
    const [count, setcount] = useState(0);
    const toggleclickInc = () =>{
        setcount(prev => prev + 1);
        alert("Hello, User");
    }
    const toggleclickDec = () => {
        setcount(prev => prev - 1);
    }
    function sayWelcome(msg){
        console.log(msg)
        alert(msg);
    }
    function handlepress(){
        alert("I was clicked");
    }
  return (
    <div>
        {count}<br></br>
      <button onClick={toggleclickInc}>Increment</button><br></br>
      <button onClick={toggleclickDec}>Decrement</button><br></br>
      <button onClick={() => sayWelcome("Welcome")}>SayWelcome</button><br></br>
      <button onClick={handlepress}>Click Me</button>
    </div>
  )
}

export default IncDec
