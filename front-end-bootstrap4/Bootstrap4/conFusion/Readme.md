Go to current workspace (where package.json has to be created)
1. ...Bootstrap4/confusion> npm install
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


*******************************************************************

For "Less" scripts:
1. Installing "lessc" Compiler
>npm install -g less@2.7.2

2. Using lessc to automatically convert less code into css code
...Bootstrap4/confusion/css> lessc styles.less styles.css

For "Scss" scripts:
1. Installing "node-saas" module
>npm install --save-dev node-sass

2. Next open your package.json file and add the following line into the scripts object there.  

   "scss": "node-sass -o css/ css/"

3. To automatically convert less code into css code
>npm run scss

package.json:

"scripts": {
"start": "npm run watch:all",
"test": "echo \"Error: no test specified\" && exit 1",
"lite": "lite-server",
"scss": "node-sass -o css/ css/",
"watch:scss": "onchange \"css/*.scss\" -- npm run scss",
"watch:all": "parallelshell \"npm run watch:scss\" \"npm run lite\""
},

*****************************************************************************************

NPM Scripts:

1. >npm install --save-dev onchange parallelshell@3.0.1 
(parallelshell v.3.0.2 has error)

Build a distribution folder containing the files that can be deployed on a web server hosting your project:

1. Cleaning up a Distribution Folder
>npm install --save-dev rimraf
>npm run clean

"clean": "rimraf dist",

2. Copying font-awesome files to distribution folder
>npm -g install copyfiles
>npm run copyfonts

 "copyfonts": "copyfiles -f node_modules/font-awesome/fonts/* dist/fonts",

3. Compressing and Minifying Images
>npm -g install imagemin-cli

 "imagemin": "imagemin img/* --out-dir='dist/img'"


package.json:

"scripts": {
    "start": "npm run watch:all",
    "test": "echo \"Error: no test specified\" && exit 1",
    "lite": "lite-server",
    "scss": "node-sass -o css/ css/",
    "watch:scss": "onchange \"css/*.scss\" -- npm run scss",
    "watch:all": "parallelshell \"npm run watch:scss\" \"npm run lite\"",
    "clean": "rimraf dist",
    "copyfonts": "copyfiles -f node_modules/font-awesome/fonts/* dist/fonts",
    "imagemin": "imagemin img/* --out-dir='dist/img'"
  },


4. Preparing the Distribution Folder:
- Add "dist" to .gitignore file

5. >npm install --save-dev usemin-cli@0.5.1 cssmin@0.4.3 uglifyjs@2.4.11 htmlmin@0.0.7

- Add these lines to package.json "scripts" block:

"usemin": "usemin contactus.html -d dist --htmlmin -o dist/contactus.html && usemin aboutus.html -d dist --htmlmin -o dist/aboutus.html && usemin index.html -d dist --htmlmin -o dist/index.html",
"build": "npm run clean && npm run imagemin && npm run copyfonts && npm run usemin"

6. >npm run build 

*************************************************************************************

Grunt and Gulp Task Runners:

1. >npm -g install grunt-cli
>npm install grunt --save-dev

2. >npm install --save-dev grunt-sass
>npm install --save-dev time-grunt jit-grunt

3. Create gruntfile.js

'use strict';

module.exports = function(grunt) {

    require('time-grunt')(grunt);

    require('jit-grunt')(grunt);

    grunt.initConfig({
        sass: {
            dist: {
                files: {
                    'css/styles.css': 'css/styles.scss'
                }
            }
        }

    });
    grunt.registerTask('css', ['sass']);
};


4. Convert scss file to css file
>grunt css

Watch and Serve Tasks:

1. >npm install --save-dev grunt-contrib-watch
>npm install --save-dev grunt-browser-sync

2. Edit gruntfile.js

'use strict';

module.exports = function(grunt) {

    require('time-grunt')(grunt);

    require('jit-grunt')(grunt);

    grunt.initConfig({
        sass: {
            dist: {
                files: {
                    'css/styles.css': 'css/styles.scss'
                }
            }
        },
        watch: {
            files: 'css/*.scss', 
            tasks: ['sass']
        },
        browserSync: {
            dev: {
                bsFiles: {
                    src: [
                        'css/*.css',
                        '*.html',
                        'js/*.js'
                    ]
                },
                options: {
                    watchTask: true,
                    server: {
                        baseDir: './'
                    }
                }
            }
        }

    });
    grunt.registerTask('css', ['sass']);
    grunt.registerTask('default', ['browserSync', 'watch']);
};

3. To start the localhost in your system:
>grunt


Copying the Files and Cleaning Up the Dist Folder

1. >npm install grunt-contrib-copy--save-dev
>npm install grunt-contrib-clean --save-dev

2. Edit gruntfile.js

'use strict';

module.exports = function(grunt) {

    require('time-grunt')(grunt);

    require('jit-grunt')(grunt);

    grunt.initConfig({
        sass: {
            dist: {
                files: {
                    'css/styles.css': 'css/styles.scss'
                }
            }
        },
        watch: {
            files: 'css/*.scss', 
            tasks: ['sass']
        },
        browserSync: {
            dev: {
                bsFiles: {
                    src: [
                        'css/*.css',
                        '*.html',
                        'js/*.js'
                    ]
                },
                options: {
                    watchTask: true,
                    server: {
                        baseDir: './'
                    }
                }
            }
        },
        ,

        copy: {
            html: {
                files: [
                {
                    //for html
                    expand: true,
                    dot: true,
                    cwd: './',
                    src: ['*.html'],
                    dest: 'dist'
                }]                
            },
            fonts: {
                files: [
                {
                    //for font-awesome
                    expand: true,
                    dot: true,
                    cwd: 'node_modules/font-awesome',
                    src: ['fonts/*.*'],
                    dest: 'dist'
                }]
            }
        },
        clean: {
            build: {
                src: [ 'dist/']
            }
        }

    });
    grunt.registerTask('css', ['sass']);
    grunt.registerTask('default', ['browserSync', 'watch']);
};


Compressing and Minifying Images:

1. >npm install grunt-contrib-imagemin --save-dev

2. Edit gruntfile.js


'use strict';

module.exports = function(grunt) {

    require('time-grunt')(grunt);

    require('jit-grunt')(grunt);

    grunt.initConfig({
        sass: {
            dist: {
                files: {
                    'css/styles.css': 'css/styles.scss'
                }
            }
        },
        watch: {
            files: 'css/*.scss', 
            tasks: ['sass']
        },
        browserSync: {
            dev: {
                bsFiles: {
                    src: [
                        'css/*.css',
                        '*.html',
                        'js/*.js'
                    ]
                },
                options: {
                    watchTask: true,
                    server: {
                        baseDir: './'
                    }
                }
            }
        },
        ,

        copy: {
            html: {
                files: [
                {
                    //for html
                    expand: true,
                    dot: true,
                    cwd: './',
                    src: ['*.html'],
                    dest: 'dist'
                }]                
            },
            fonts: {
                files: [
                {
                    //for font-awesome
                    expand: true,
                    dot: true,
                    cwd: 'node_modules/font-awesome',
                    src: ['fonts/*.*'],
                    dest: 'dist'
                }]
            }
        },
        clean: {
            build: {
                src: [ 'dist/']
            }
        },
        imagemin: {
            dynamic: {
                files: [{
                    expand: true,                  // Enable dynamic expansion
                    cwd: './',                   // Src matches are relative to this path
                    src: ['img/*.{png,jpg,gif}'],   // Actual patterns to match
                    dest: 'dist/'                  // Destination path prefix
                }]
            }
        }

    });
    grunt.registerTask('css', ['sass']);
    grunt.registerTask('default', ['browserSync', 'watch']);
    grunt.registerTask('build', [
        'clean',
        'copy',
        'imagemin'
    ]);
};

3. >grunt build