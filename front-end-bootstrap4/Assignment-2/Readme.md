Go to current workspace (where package.json has to be created)
1. ...Bootstrap4/confusion>npm install
>npm init

2. Install lite-server for auto-sync to the webpage
>npm install lite-server --save-dev

3. Create 'gitignore' file and include 'node_modules' in it.

4. >npm install bootstrap@4.0.0 --save
5. >npm install jquery@3.3.1 popper.js@1.12.9 --save
6. Start lite-server
>npm start 

7. Insert the following code in the <head> of index.html file before the title.

 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css">

8. At the bottom of the page, just before the end of the body tag, add the following code to include the JQuery library, popper.js library and Bootstrap's Javascript plugins. Bootstrap by default uses the JQuery Javascript library for its Javascript plugins. Hence the need to include JQuery library in the web page.

 <!-- jQuery first, then Popper.js, then Bootstrap JS. -->
    <script src="node_modules/jquery/dist/jquery.slim.min.js"></script>
    <script src="node_modules/popper.js/dist/umd/popper.min.js"></script>
    <script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>

*****************************************************************************

For icons/buttons on webpage:

1. Install FontAwesome and BootstrapSocial packages into your system for including icons/buttons in the webpage.
>npm install font-awesome --save
>npm install bootstrap-social --save

2. Include the following code in the <head>
  <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="node_modules/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="node_modules/bootstrap-social/bootstrap-social.css">
    <link rel="stylesheet" href="css/styles.css">