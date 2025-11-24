const os = require('os');

console.log(os.platform())

console.log(os.totalmem());

console.log(os.freemem());

console.log(os.cpus());

const http = require('http');

const server = http.createServer((req, res)=>{
    if(req.url=== '/' && req.method==='GET'){
        
        res.end('<h1>Hello from server</h1>');
    } else if(req.url === '/users' && req.method === 'POST'){
        res.writeHead(201,{'content-type':'plain/text'})
        res.end('Hello users');
    }
    else{
        res.writeHead(401,{'content-type':'plain/text'})
        res.end('Unauthorized')
    }
})

server.listen(6000, (err)=>{
    console.log(err);
})