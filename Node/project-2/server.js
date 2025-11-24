const {sum} = require('./math')

const fsPromise = require('fsPromise')

console.log('Hello ');

console.log(sum(10,15));

// fs.writeFileSync('index.html', '<h1>Hello from node</h1>');

// fs.writeFile('demo2.txt', 'second file', (err)=>{
//     console.log(err);
//  })

//fs.unlinkSync('demo1.txt');

// fs.unlink('demo2.txt', (err)=>{
//     console.log(err);
// })

// fs.readFile('demo2.txt', 'utf-8', (err, data)=>{
//     console.log(data);
// })

// fs.appendFile('demo2.txt', '\nnew data', (err)=>{
//     console.log(err);
// })

fs.cp('demo2.txt', 'demo1.txt').then(data=>console.log(data)).catch(err=>console.log(error))



