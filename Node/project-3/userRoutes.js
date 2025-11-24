const express = require('express')

const router = express.Router();

router.get('/all', (req, res)=>{
    res.json({message:'request received'})
}) 

module.exports = router