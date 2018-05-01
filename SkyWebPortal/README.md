# Product Selection:

This project is a Spring Boot application which allows to select the products that are available based on the location of customer home.


## Getting Started and installing:

This project can be imported directly as a Maven project.All the dependency needed for the project are handled in the POM. 

## Model:

Catalogue and Location are the model classes.

## Database:
 
This project is implemented with H2 database. It can be accessed through a browser based console.
 
## Tests:

The tests are written in Mockito.
Given, When and Then are used for the tests definition.

## How to run:

Check out/clone the project.
`mvn spring-boot:run ` command can be used to run from the command line.
Also it can be run using the command `java -jar target/SkyWebPortal-0.0.1-SNAPSHOT.jar`

## SpringBoot and H2 - why:

H2 is an in-memory database and comes with easy maintenance.It is only added as a dependency in the project and can be accessed through a browser console. Spring Boot has a good integration with H2.

## Security:
This application maintains customer id across pages. So the user is required to log out after placing orders.
The application is implemented using the named parameters with Hibernate Query Language thereby preventing the chances of sql injections. 


