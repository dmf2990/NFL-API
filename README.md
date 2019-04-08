## Vanilla JavaScript Exploration NFL - JAVA Backend

This project is simple exploration into vanilla JS while using a non-segregated backend.  I utilized Parcel as a bundler, however the JavaScript is set up in modulues that can be utilized for a variety of functions (see App.js). Boiler plate type functions allow me to utilize things like fetch requests as functions (only passing unique params to zero in on what is needed, and optimize efficiency of code).  CSS has not been implemented here as Spring MVC, and JavaScript are primary focus.  In the future, I will be adding the ability to delete, add, and alter players, teams, and divisions. 

JPA, H2, Eclipse, Visual Studio Code, and Java Spring MVC model. 

## Dependencies used
    compile("org.springframework.boot:spring-boot-starter-web")
    compile('org.springframework.boot:spring-boot-starter-data-jpa')
    runtime('com.h2database:h2')
    https://parceljs.org/getting_started.html

## Instructions for use 

Clone 'master' Branch project from GitHub - navigate into the directory, and 'gradle eclipse' this file. Once imported to Eclipse, run the application as a Java Project.  

Then open your terminal (bash) and enter 'npm run build'.  This will tell Parcel to bundle our JavaScript files, and then you will be able to navigate to `localhost:8080/`

### What I really like?

I will say parcel does a great job once installed correctly. I also love the structure of this project. Fetch Requests, Post Requests, and Get Requests are set up nicely for re-use.

### Reference docs utilized
https://spring.io/guides 
https://start.spring.io/
https://stackoverflow.com/
https://parceljs.org/getting_started.html
https://developer.mozilla.org/en-US/docs/Web/javascript

