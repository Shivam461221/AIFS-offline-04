const express = require('express');
const { createUser, login } = require('../controllers/userController');
const auth = require('../middlewares/AuthMiddleware')

const router = express.Router();

router.post('/create', auth, createUser)

router.post('/login', login)

router.delete('/deleteUser', )

module.exports = router; 