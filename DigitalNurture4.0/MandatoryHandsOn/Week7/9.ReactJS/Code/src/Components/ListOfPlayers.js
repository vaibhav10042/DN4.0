import React from 'react'

const ListOfPlayers = () => {
    const players = [
        {name: 'Virat Kholi',score: 98},
        {name: 'Sachin Tendulkar', score: 100},
        {name: 'Dhoni', score: 100},
        {name: 'Hardik Pandiya', score:50},
        {name: 'R Ashwin', score: 77},
        {name: 'Rohit Sharma', score: 99},
        {name: 'KL Rahul', score:44},
        {name: 'Shubman Gill', score: 79},
        {name: 'Jasprit Bumrah', score: 33},
        {name: 'Yuzvendra Chahal', score: 12},
        {name: 'Ravindra Jadeja', score: 61}
    ]
    const players70 = players.filter(player => player.score < 70);
  return (
    <div>
      <h1> List of Players</h1>
      <ul>
        {players.map((player, index) => (
            <li key={index}>
                <strong>{player.name}</strong> - Score: {player.score}
            </li>
        ))}
      </ul>
      <h3>Players Scored less than 70</h3>
      <ul>
        {players70.map((player) => (
            <li>{player.name} - Score:{player.score} </li>
        ))}
      </ul>
      
    </div>
  )
}

export default ListOfPlayers
