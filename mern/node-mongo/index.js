const MongoClient = require('mongodb').MongoClient;
const assert = require('assert');
const dboper = require('./operations');

const url = 'mongodb://localhost:27017/';
const dbname = 'conFusion';

//Promises code
MongoClient.connect(url).then((client) => {

    console.log('Connected correctly to server');
    const db = client.db(dbname);

    dboper.insertDocument(db, { name: "Vadonut", description: "Test"},
        "dishes")
        .then((result) => {
            console.log("Insert Document:\n", result.ops); //ops tells number of insert operations carried out

            return dboper.findDocuments(db, "dishes");
        })
        .then((docs) => {
            console.log("Found Documents:\n", docs);

            return dboper.updateDocument(db, { name: "Vadonut" },
                    { description: "Updated Test" }, "dishes");

        })
        .then((result) => {
            console.log("Updated Document:\n", result.result);

            return dboper.findDocuments(db, "dishes");
        })
        .then((docs) => {
            console.log("Found Updated Documents:\n", docs);
                            
            return db.dropCollection("dishes");
        })
        .then((result) => {
            console.log("Dropped Collection: ", result);

            return client.close();
        })
        .catch((err) => console.log(err));

})
.catch((err) => console.log(err));


//Callback Hell problem with this code. Hence, remove call backs from operations.js and use Promises in index.js to resolve it and handle errors (implemented in above working code)
// MongoClient.connect(url, (err, client) => {

//     assert.equal(err, null);

//     console.log('Connected correctly to server');

//     const db = client.db(dbname);
    
//     dboper.insertDocument(db, { name: "Vadonut", description: "Test" },
//         "dishes", (result) => {
//             console.log("Insert Document:\n", result.ops);

//             dboper.findDocuments(db, "dishes", (docs) => {
//                 console.log("Found Documents:\n", docs);

//                 dboper.updateDocument(db, { name: "Vadonut" },
//                     { description: "Updated Test" }, "dishes",
//                     (result) => {
//                         console.log("Updated Document:\n", result.result);

//                         dboper.findDocuments(db, "dishes", (docs) => {
//                             console.log("Found Updated Documents:\n", docs);

//                             db.dropCollection("dishes", (result) => {
//                                 console.log("Dropped Collection: ", result);

//                                 client.close();
//                             });
//                         });
//                     });
//             });
//         });

// });