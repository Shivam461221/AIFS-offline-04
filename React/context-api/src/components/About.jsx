import { useContext } from "react"
import { CountContext } from "../Context/Context"

export default function About(){
    const {count} = useContext(CountContext);
    return<>
        <h2>About {count} </h2>
    </>
}