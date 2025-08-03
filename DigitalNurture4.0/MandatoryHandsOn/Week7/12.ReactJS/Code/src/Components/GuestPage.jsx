import React from 'react'

const GuestPage = ({onlogin}) => {
  return (
    <div>
      <h2>You are a Guest, Booking App Welcomes you, Hello Guest!!</h2>
      <p>
        <ul>
            <li>Indigo - 10:00 AM - Delhi to Mumbai</li>
            <li>SpiceJet - 1:30 PM - Mumbai to Bangalore</li>
            <li>Air India - 5:00 PM - Delhi to Chennai</li>
        </ul>
        <p>You Have To Login To Book The Tickets!!</p>
      </p>
      <button onClick={onlogin}>Login</button>
    </div>
  )
}

export default GuestPage
