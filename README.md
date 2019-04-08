# spring-boot-quickstart

## What is Spring ?
  * Application framework
  * Programming and configuration model
  * Infrastructure support
  
## Problems with Spring
  * Huge framework
  * Multiple setup steps
  * Multiple configuration steps
  * Multiple build and deploy steps
  
## Spring Boot
  * Opinionated
  * Convention over configuration
  * Stand alone
  * Production ready
  
## Starting Spring Boot
  ```
  SpringApplication.run(App.class, args)
  ```
  * Setup default configuration
    * As Spring Boot uses convention over configuration, it addresses the 80% usecases.
  * Starts Spring application context
    * Spring is a container for all of your code that runs on application server, this container is the application context.
  * Performs class path scan
    * Scans all of your code looking for annotations to treat them the way they should be treated.
  * Starts Tomcat server
    * Starts the tomcat server.

## Adding a Controller
    * Basically adding a JAVA class
    * Marked with annotations
    * Has information about
        * What URL access triggers it
        * What method to run when accessed