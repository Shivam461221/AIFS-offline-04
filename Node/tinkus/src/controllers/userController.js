const User = require('../models/User')
const bcrypt = require('bcryptjs')
const jwt = require('jsonwebtoken')

async function createUser(req, res) {
    try {
        const {name, age, password, email, location} = req.body;

        let existingUser = await User.findOne({email});

        if(existingUser){
            return res.status(400).json({message:'email already exist'});
        }

        const hashedPassword = await bcrypt.hash(password, 10);

        const user = await User.create({
            name, email, age, password:hashedPassword, location
        });
        console.log('user created')
        res.status(201).json({ message: 'User created', data: user })
    }
    catch (err) {
        res.status(500).json({ message: err })
    }
}

async function login(req, res){
    try{
        const {email, password} = req.body;

        let existingUser = await User.findOne({email});

        if(!existingUser){
            return res.status(400).json({message:'No details found'})
        }

        const match = await bcrypt.compare(password, existingUser.password)

        if(!match){
            return res.status(400).json({message:'Invalid credential'})
        }

        const token = jwt.sign({userId:existingUser._id, role:'admin'}, process.env.SECRET, {expiresIn:'1H'})

        res.status(200).json({message:'Login successful', token}, )

    }
    catch(err){
        res.status(500).json({message:err});
    }
}

module.exports = { createUser, login }


