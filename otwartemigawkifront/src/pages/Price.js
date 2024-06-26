import { React, useState, useEffect } from 'react';
import AppBar from '../components/AppBar.js';
import "../css/Price.css";
import { fetchPrices } from '../api/price-api.js';


const Price = () => {
  const [sessionsData, setSessionTypes] = useState([]);

  useEffect(() => {
    fetchPrices(setSessionTypes)
  }, []);

  return (
    <div>
      <AppBar />
      <h1 className='flex-centered site-header'>Cennik</h1>
      <div className='flex-centered price-segment-main'>
        {sessionsData.map(session => (
          <PriceSegment
            key={session.sessionTypeId}
            type={session.sessionTypeName}
            price={session.price}
            description={session.description}
            photo={session.coverPhotoPath}
          />
        ))}
      </div>
    </div>
  );
}


const PriceSegment = ({ type, price, description, photo }) => {
  return (
    <div className='price-segment sparkle u-hover--sparkle'>
      <div className='price-segment-image-div'>
        <img src={photo} className='price-segment-image' alt={type} />
      </div>
      <div className='price-segment-description'>
        <h2>{type}</h2>
        <h4>{price} PLN</h4>
        <span>{description}</span>
        <a className='link price-link' href="/rezerwacja">Zarezerwuj</a>
      </div>
    </div>
  );
}


export default Price;