import React from 'react'

const UserPage = ({onlogout}) => {
  return (
    <div>
      <h2>Welcome Back!, User</h2>
      <p>
        <ul>
            <li>Indigo - 10:00 AM - Delhi to Mumbai <button>Book</button></li>
            <li>SpiceJet - 1:30 PM - Mumbai to Bangalore <button>Book</button></li>
            <li>Air India - 5:00 PM - Delhi to Chennai <button>Book</button></li>
        </ul>
      </p>
      <p>You can book the tickets!!!!</p>
      <button onClick={onlogout}>Logout:(</button>
    </div>
  )
}

export default UserPage
