1. Install yarn

2. Verify after installation in your local system
>yarn -v

3. Creating a react app
>npm install -g create-react-app
create-react-app --help

4. Go to your desired folder
> create-react-app confusion
cd confusion
yarn start

5. Configure bootstrap into react
.../Confusion>yarn add bootstrap@4.0.0
yarn add reactstrap@5.0.0 react-popper@0.9.2



*****************************************************************
For "FontAwesome" and "BootstrapSocial":

1. >yarn add font-awesome@4.7.0
yarn add bootstrap-social@5.1.1


****************************************************************
React Router:

1. >yarn add react-router-dom@4.2.2


****************************************************************
Redux:

1. >yarn add redux@3.7.2
yarn add react-redux@5.0.7

****************************************************************
React-Redux Forms:

1. >yarn add react-redux-form@1.16.8

****************************************************************
Redux Thunk:

1. >yarn add redux-thunk@2.2.0
yarn add redux-logger@3.0.6


****************************************************************
Installing JSON server:

1. Create a folder for json server anywhere in the system

2. react-front-end>mkdir json-server
cd json-server
npm install json-server -g

Start JSON server:
>json-server --watch db.json -p 3001 -d 2000

***************************************************************************
Fetch:

1. >yarn add cross-fetch@2.1.0

***************************************************************************
Animations:

1. >yarn add react-transition-group@2.3.0

***************************************************************************
Animation Components:

1. >yarn add react-animation-components@3.0.0
yarn add prop-types@15.6.0


******************************************************************
Building a build folder:

1. ..../confusion>npm run build

Deploying your React Application

- To deploy your React application you need a server. Fortunately we already have the json-server available on our computer.
- Copy the contents of the build folder to the public folder of your json-server
- Now your React application can be accessed at the link http://localhost:3001/.
- If you are setting up a server on the cloud or anywhere, all that you need to do is copy the contents of the build folder to the server side to deploy your React application. The exact procedure depends on the cloud service provider that you choose to use. Please consult their documentation to see the procedure to set up the server.