
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { useState, useEffect } from 'react'
import Header from './components/Header';
import Products from './components/Products';

function App() {
  //const [count, setCount] = useState(0);

  //useEffect, useNavigate, useContext, useLocation
  

  const sum=()=>{
    setCount(count+1);
    //x++;
    //console.log(x);
  }

  const substract=()=>{
    setCount(count-1);
    //x--;
  }

  return (
    <>
    {/* <Header/>
      <h1>Count: {count}</h1>
      <h2>X : </h2>

      <button onClick={sum} >Add</button>
      <button onClick={substract} >Substract</button> */}

      <Products/>
    </>
  )
}

export default App
