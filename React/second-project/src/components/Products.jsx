import { useEffect, useState } from "react"

export default function Products(){
    const [products, setProducts] = useState([]);

    const getProducts= async()=>{
        try{
            let response =await fetch('https://dummyjson.com/products');
            let data = await response.json();
            console.log(data);
            setProducts(data.products);
        }
        catch(error){
            console.log("error",error);
        }
    }

    useEffect(()=>{
        getProducts();
        console.log('Called once');
    }, []);

    

    return <>
       {
        products.map((product, index)=><span key={index} ><img src={product.thumbnail} /> <br/><span>{product.title}</span> </span>)
       }
    </>
}