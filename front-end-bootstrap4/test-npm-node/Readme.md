Commands:

1. >npm init
--enter your details

2. Install lite-server for auto-sync to the webpage
>npm install lite-server --save-dev

3. Open package.json and modify as below:
"scripts": {
    "start": "npm run lite",
    "test": "echo \"Error: no test specified\" && exit 1",
    "lite": "lite-server"
  },


4. Create "index.html" file for demo

5. >npm start

6. Create "gitignore" file and add "node_modules" folder to it.