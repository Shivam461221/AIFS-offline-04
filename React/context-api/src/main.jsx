import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import { CountContext } from './Context/Context.jsx'
import { CountProvider } from './Context/CountProvider.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <CountProvider>
       <App />
    </CountProvider>
  </StrictMode>,
)
