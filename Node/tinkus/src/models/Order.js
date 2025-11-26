const mongoose = require('mongoose');

const orderSchema = new mongoose.Schema({
    name:{
        type:String,
        required:true
    },
    description:{
        type:String,
        required:false
    },
    price:{
        type:Number,
        required:true
    },
    isAvailable:{
        type:Boolean,
        required:true
    }
}, {
    timestamps:true
});

module.exports = mongoose.model("Order", orderSchema)