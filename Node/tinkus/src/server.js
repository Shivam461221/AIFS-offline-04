require('dotenv').config();
const express = require('express');

const connectDB = require('./config/db')

const app = express();
app.use(express.json())

const userRoutes = require('./routes/userRoutes')

app.use('/user', userRoutes)

connectDB();

app.listen(process.env.PORT, ()=>{
    console.log('Server started at port', process.env.PORT);
})
