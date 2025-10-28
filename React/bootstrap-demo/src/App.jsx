import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css'
import Header from './components/Header/Header'
import {Route, Routes} from 'react-router-dom'
import About from './components/About/About'

function App() {
  const [username, setUsername] = useState('');
  //xs, sm, md, lg, xl
  console.log(username)

  return (
    <>
     
      <Header/>
      <Routes>
        <Route path='/about' element={<About/>} />
        
      </Routes>
    </>
  )
}

export default App
