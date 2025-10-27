import { useState } from "react"
import { CountContext } from "./Context";

export const CountProvider =({children})=>{
    const [count, setCount] = useState(10);

    const increase=()=>{
        setCount(count+1);
    }

    const decrease=()=>{
        setCount(count-1);
    }

    return <CountContext.Provider value={{count, increase, decrease}} >
        {children}
    </CountContext.Provider>
}

