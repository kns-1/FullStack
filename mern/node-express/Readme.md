>npm install express@4.16.3 --save
npm install morgan@1.9.0 --save
npm install body-parser@1.18.3 --save
npm install express-generator@4.16.0 -g


mern/mongodb> mongod --dbpath=data --bind_ip 127.0.0.1
>mongo
db
use conFusion
db
db.help()
db.dishes.insert({ name: "Uthappizza", description: "Test" });
db.dishes.find().pretty();
var id = new ObjectId();
id.getTimestamp();