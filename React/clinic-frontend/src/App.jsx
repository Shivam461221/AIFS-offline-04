import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Header from './components/Header'
import Slider from './components/Slider'
import Book from './components/Book'
import About from './components/About'
import Treatment from './components/Treatment'
import Team from './components/Team'
import Client from './components/Client'
import Contact from './components/Contact'
import Footer from './components/Footer'
import Home from './components/Home'
import { Route, Routes } from 'react-router-dom'
import Login from './components/Login'
import Dashboard from './Components/Dashboard'
import AddDoctor from './Components/AddDoctor'
import ProtectedRoute from './Components/ProtectedRoute'
import DoctorsList from './Components/DoctorsList'
import 'react-toastify/dist/ReactToastify.css';


function App() {
  

  return (
    <>
     <Header/>
      <Routes>
        <Route path='/' element={<Home/>} />
        
        <Route path='/book' element={<Book/>} />
        <Route path='/about' element={<About/>} />
        <Route path='/treatment' element={<Treatment/>} />
        <Route path='/team' element={<Team/>} />
        <Route path='/client' element={<Client/>} />
        <Route path='/contact' element={ <Contact/>} />
        <Route path='/login' element={<Login/>} />
        <Route path='/dashboard' element={<ProtectedRoute><Dashboard/></ProtectedRoute>} />
        <Route path='/add-doctor' element={<AddDoctor/>} />
        <Route path='/doctors-list' element={<DoctorsList/>} />


      </Routes>
      <Footer/>
    </>
  )
}

export default App
