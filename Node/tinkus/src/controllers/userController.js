const User = require('../models/User')

async function createUser(req, res) {
    try {
        const user = await User.create(req.body);
        console.log('user created')
        res.json({ message: 'User created', data: user })
    }
    catch (err) {
        res.status(400).json({ message: err })
    }
}

module.exports = { createUser }


