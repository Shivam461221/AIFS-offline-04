import { useState } from "react"
import { UserContext } from "./UserContext";

export const UserProvider = ({children}) =>{
    const [user, setUser] = useState({});
    const [token, setToken] = useState('');
    const [isLoggedIn, setIsLoggedIn] = useState(false);

    
    return <UserContext.Provider value={{user, token, isLoggedIn, setUser, setToken, setIsLoggedIn}}>
        {children}
    </UserContext.Provider>
}