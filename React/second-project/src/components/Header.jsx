import { useState } from "react";

function Header(){
const [username, setUsername] = useState('');



    return <>

        <h1>Welcome {username}</h1>
        <input value={username} onChange={(event)=>setUsername(event.target.value)} type="text" />
    </>
}
export default Header;