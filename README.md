Spring Boot with Docker
=======================

Spring Boot Demo with Docker support


### Docker

* docker compose
* spotify docker-maven-plugin 


### How to build and run

* mvn -DskipTests clean package docker:build
* docker run -d -p 8080:8080 -t linuxchina/boot-demo-docker


### reference

* https://spring.io/guides/gs/spring-boot-docker/