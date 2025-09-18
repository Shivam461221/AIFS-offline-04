

let head = document.getElementById('head');

head.style.border = '2px solid red';

head.textContent = 'This is a DOM ';

let para = document.getElementsByTagName('p');

let container = document.getElementsByClassName('container');

container[1].style.backgroundColor = 'red';

console.log(container);

para[0].textContent = 'This is a paragraph';

console.log(para);


console.log(head);


let img = document.querySelector('');

img.src = 500;