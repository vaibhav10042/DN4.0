import React from 'react'

const Officehome = () => {
    const image = "https://tse2.mm.bing.net/th/id/OIP.8YZV7QL1_B0THOgw8UeYPgHaEI?pid=Api&P=0&h=180";
    const details = [
        {
            name : "SmartSpace",
            rent: 200,
            address: "Block 5, Tidel Park, Bengaluru, India"
        },
        {
            name: "WorkNest Co-Working",
            rent: 18000,
            address: "MG Road, Hyderabad, India"
        },
        {
            name: "ProDesk Suites",
            rent: 30000,
            address: "Outer Ring Road, Chennai, India"
        }
    ]
  return (
    <>
    <div>
      <h1>Office Space , At Affordable Price!!!</h1>
      <img 
      src={image}
      alt='image'
      ></img>
    </div>
    <div>
      {details.map((office) => {
        const rentstlye = {
            color: office.rent < 60000 ? 'red' : 'green' 
        };
        return (
            <div>
            <strong><p>Name :{office.name}</p>
            <p style={rentstlye}>Rent Rs :{office.rent}</p>
            <p>Address :{office.address}</p></strong>
            </div>
        );} 
      )}
      </div>
      </>
  )
}

export default Officehome
