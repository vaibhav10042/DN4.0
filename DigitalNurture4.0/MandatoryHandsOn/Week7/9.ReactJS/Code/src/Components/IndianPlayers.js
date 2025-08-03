import React from 'react'

const IndianPlayers = () => {
    const players = [
        'Virat Kohli',
        'Rohit Sharma',
        'Shubman Gill',
        'KL Rahul',
        'Hardik Pandya',
        'Ravindra Jadeja',
        'MS Dhoni',
        'Jasprit Bumrah',
        'Mohammed Shami',
        'R Ashwin',
        'Yuzvendra Chahal'
    ]
    const oddteam = players.filter((_, index) => index % 2 === 0);
    const eventeam = players.filter((_, index) => index % 2 === 1);

    const t20players =[
        'Suryakumar Yadav',
        'Rinku Singh',
        'Tilak Varma',
        'Ishan Kishan',
        'Shivam Dube'
    ]
    const ranjitrophyplayers = [
        'Wasim Jaffer',
        'Faiz Fazal',
        'Jalaj Saxena',
        'Abhimanyu Easwaran',
        'Hanuma Vihari'
    ]
    const mergedplayers = [...ranjitrophyplayers, ...t20players];
  return (
    <div>
      <h2> Odd Team Players</h2>
      <ul>
        {oddteam.map((player) => (
            <li>{player}</li>
        ))}
      </ul>
      <h2>Even Team Players</h2>
      <ul>
        {eventeam.map((player) => (
            <li>{player}</li>
        ))}
      </ul>
      <h2>Merged Players(t20, ranjitrophy)</h2>
      <ul>
        {mergedplayers.map((player, index) => (
            <li>{index} : {player}</li>
        ))}
      </ul>
    </div>
  )
}

export default IndianPlayers
