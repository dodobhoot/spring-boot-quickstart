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

## Starting a Spring Boot App (Getting the setup)
  * Spring Initializr
    * `start.spring.io` website provides UI solution to start a Spring Boot project
  * Spring Boot CLI
  * STS IDE
  
## What happens when you run a Spring Boot application ?
  ```
  SpringApplication.run(App.class, args)
  ```
  * Setup default configuration
    * As Spring Boot uses convention over configuration, it addresses 80% use cases.
  * Starts Spring application context
    * Spring is a container for all of your code that runs on application server, this container is the application context.
  * Performs class path scan
    * Scans all of your code looking for annotations to treat them the way they should be treated.
  * Starts Tomcat server
    * Starts the tomcat server.

## Customizing Spring Boot
  `application.properties` <br>
   * ```server.port = 3000``` <br>
   To get the keys of application properties go through this [link](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)

## Adding a Controller
  * Basically adding a JAVA class
  * Marked with annotations
  * Has information about
    * What URL access triggers it
    * What method to run when accessed

## Embedded Tomcat Server
  * Convenience
  * Servlet container configuration is now application configuration
  * Standalone application
  * Useful for micro services architecture
  
## Spring Data JPA
  * Java persistence API
  * Object Relational Mapping is Class to Table mapping
  