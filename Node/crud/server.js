const {MongoClient, ObjectId} = require('mongodb')

const url  = "mongodb://127.0.0.1:27017/?directConnection=true&serverSelectionTimeoutMS=2000&appName=mongosh+2.5.7";

const client = new MongoClient(url); 

async function connectDB(){
    try{
        await client.connect();
        console.log('Database connected')
        const db = client.db('crud');
        const collection = db.collection('users');

       // const result = await collection.insertOne({name:'ayush', age:25});

        //const result = await collection.find().toArray();

       // const result = await collection.updateOne({name:'shivam'}, {$set:{email:'shivam@123'}});
        const result = await  collection.deleteOne({_id: new ObjectId('6925b2ad04342537070024ee')});
       
       console.log(result);

    }
    catch(err){
        console.log(err)
    }
    finally{
        await client.close();
        console.log('Connection closed');
    }
}

connectDB();