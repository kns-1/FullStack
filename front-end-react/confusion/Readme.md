1. >npm install -g yarn
npm init
npm install
npm install lite-server --save-dev

2. modify "package.json"

 "scripts": {
    "start": "npm run lite",
    "test": "echo \"Error: no test specified\" && exit 1",
    "lite": "lite-server"
  },

3. >yarn start