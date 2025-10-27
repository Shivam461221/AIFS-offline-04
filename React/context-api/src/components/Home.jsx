import { useContext } from "react"
import { CountProvider } from "../Context/CountProvider"
import { CountContext } from "../Context/Context";

export default function Home(){

    const {count, increase, decrease} = useContext(CountContext);
    return <>
        <h1>Home {count} </h1>

        <button onClick={increase}>Increase</button>

        <button onClick={decrease}>Decrease</button>
    </>
}