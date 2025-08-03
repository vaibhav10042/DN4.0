import React, { useState } from 'react'

const Currencyconverter = () => {
    const [price, setprice] = useState('');
    const [euro, seteuro] = useState('');
    const [showResult, setShowResult] = useState(false);

    const conversionRate = 90;
    const handlechange = () =>{
        if(price === '' || isNaN(price)){
            alert("please enter a valid number");
            return;
        }
        const result = parseFloat(price) / conversionRate;
        seteuro(result.toFixed(2));
        setShowResult(true);
    }

  return (
    <div>
        <h2 style={{color:'green'}}>~~~Currency Converter~~~</h2>
        <p style={{color:'red', font:'caption'}}>Converts only  Indian Rupees to Euros</p>
        <label>Indian Rupees</label><input placeholder='enter the rupees'
         value={price}
         type='text' 
         onChange={(e) =>{
         setprice(e.target.value)
         setShowResult(false)
         }} ></input>
            
        <br></br>
        <button onClick={handlechange}>Convert To Euros</button>
         <br></br>

        <p>{price} rupees = {euro} Euros</p>   
        
    </div>
  )
}

export default Currencyconverter
