import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Home from './components/Home'
import { Link, Route, Routes } from 'react-router-dom'
import About from './components/About'
import 'bootstrap/dist/css/bootstrap.min.css'
import Header from './components/Header'
import Contact from './components/Contact'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
     <Header/>

     <Routes>
      <Route path='/' element={<Home/>} />
      <Route path='/about' element={<About/>} />
      <Route path='/contact' element={<Contact/>} />
     </Routes>

    </>
  )
}

export default App
