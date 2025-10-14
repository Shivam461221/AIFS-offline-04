import { Link } from "react-router-dom";

export default function Header(){

    return <>
        <div className="container-fluid d-flex display-6 justify-content-between">
            <div><Link to={"/"}>Home</Link></div>
            <div><Link to={"/about"}>About</Link></div>
            <div><Link to={"/contact"}>Contact</Link></div>
            <div>Contact</div>
            <div>Login</div>
            <div>SignUp</div>
        </div>
    </>
}