import { Link, useNavigate } from "react-router-dom";

export default function About(){

    const navigate = useNavigate();

    const moveToHome=()=>{
        navigate("/");
    }

    return <>
        <h1>About</h1>

        <button onClick={moveToHome}>home</button>


    </>
}