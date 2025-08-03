import React, { useState } from 'react'

const ComplaintRegister = () => {
    const [empname, setempname] = useState('');
    const [compText, setcompText] = useState('');
    const handleSubmit = (e) =>{
        e.preventDefault();
        if(!empname.trim() || !compText.trim()){
            alert("please fill in both fields.");
            return;
        }
        alert(`Complaint submitted successfully!!\nWe will work on your complaint`);
        setempname('');
        setcompText('');
    };
  return (
    <div style={{ padding: '20px', maxWidth: '500px', margin: 'auto' }}>
      <h1>Register Your Complaint Here!!</h1>
      <form onSubmit={handleSubmit}>
        <div>
        <label>Enter you Name : </label><br></br>
        <input type='text' style={{ width: '100%', padding: '8px', marginBottom: '10px' }}value={empname} onChange={(e) => setempname(e.target.value)}
        />
        </div>
        <div>
        <label>Mention Your Query/Complaint In Here: </label><textarea style={{ width: '100%', padding: '8px', marginBottom: '10px' }}
        value={compText} onChange={(e) => setcompText(e.target.value)}></textarea>
        </div>
        <button type='submit' style={{ padding: '10px 20px' }}>Submit Complaint</button>
      </form>
    </div>
  )
}

export default ComplaintRegister
