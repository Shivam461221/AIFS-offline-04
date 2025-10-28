import { Link } from 'react-router-dom'
import './Header.css'
export default function Header(){
    return <>
        <div className="container-fluid ">
            <div className="row p-2 header text-white">
                <div className="col-md-4 col-sm-4 col-10 display-4">Logo</div>
                <div className="col-md-8 col-sm-8 d-sm-flex d-md-flex display-6 d-none d-flex justify-content-evenly align-items-center">
                    <div><Link>Home</Link></div>
                    <div><Link to={'/about'} >About</Link></div>
                    <div>Career</div>
                    <div>Education</div>
                    <div>Contact</div>
                </div>
                <div className="col-1 h1 d-flex justify-content-center align-items-center d-sm-none d-md-none">
                    <i className='bxr  bx-menu-wide'></i>
                </div>
                
            </div>
        </div>
    </>
}