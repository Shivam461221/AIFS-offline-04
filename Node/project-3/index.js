const express = require('express');
const userRoutes = require('./userRoutes')
require('dotenv').config()

const app = express();

app.use(express.json());

app.use('/user', userRoutes)

// app.get('/', (req, res)=>{
// res.end('Request received')
// })

// app.use((req, res, next)=>{
//    if(req.url ==='/user')
//    {
//     next();
//    }
//    else{
//     res.end('wrong url')
//    }
// })



// app.post('/user', (req, res)=>{

//     res.json({message:'User created', data:req.body});
// })

app.listen(process.env.PORT, ()=>{
    console.log('Server running on port 3000');
})

