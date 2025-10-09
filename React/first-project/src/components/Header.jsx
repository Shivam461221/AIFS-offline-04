
export default function Header(){
    let x = 20;
    const getData=()=>{
        console.log("Data");
    }

    getData();

    return (
        <>
        <h1 className="header" style={{backgroundColor:"red"}} >Header Component {x}</h1>
        </>
    )
}

//export default Header;