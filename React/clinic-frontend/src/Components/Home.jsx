import About from "./About";
import Book from "./Book";
import Client from "./Client";
import Contact from "./Contact";
import Slider from "./Slider";
import Team from "./Team";
import Treatment from "./Treatment";

export default function Home() {
    return <>
        <Slider />
        <Book />
        <About />
        <Treatment />
        <Team />
        <Client />
        <Contact />
    </>
}