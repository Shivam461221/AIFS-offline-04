import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import axios, { Axios } from 'axios';
import { useEffect } from 'react';


function App() {
 
  const [users, setUsers] = useState([]);

  const getUsers = async()=>{
    try{
      let response = await axios.get('https://dummyjson.com/users');
      setUsers(response.data.users);
      console.log(response.data.users);
    }
    catch(error){
      console.log(error);
    }
  }

  useEffect(()=>{
    getUsers();
  },[])


  return (
    <>
      <ul>
        {
          users.map((user, index)=>
         <li key={index} >{user.firstName}</li> )
        }
      </ul>
    </>
  )
}

export default App
