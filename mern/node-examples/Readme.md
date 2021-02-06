>npm init

- Modify package.json:
{
  "name": "node-examples",
  "version": "1.0.0",
  "description": "Simple Node Examples",
  "main": "index.js",
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1",
    "start": "node index"
  },
  "author": "Jogesh Muppala",
  "license": "ISC"
}


- Create index.js:

var rect = {
	perimeter: (x, y) => (2*(x+y)),
	area: (x, y) => (x*y)
};

function solveRect(l,b) {
    console.log("Solving for rectangle with l = " + l + " and b = " + b);

    if (l <= 0 || b <= 0) {
        console.log("Rectangle dimensions should be greater than zero:  l = "
               + l + ",  and b = " + b);
    }
    else {
	    console.log("The area of the rectangle is " + rect.area(l,b));
	    console.log("The perimeter of the rectangle is " + rect.perimeter(l,b));
    }
}

solveRect(2,4);
solveRect(3,5);
solveRect(0,5);
solveRect(-3,5);



>npm start

******************************
Node Module:

- Create rectangle.js:
exports.perimeter =  (x, y) => (2*(x+y));

exports.area = (x, y) => (x*y);


- Modify index.js:
var rect = require('./rectangle');

>npm start