FROM java:8u77-jdk-alpine
VOLUME /tmp
ADD target/boot-demo-docker.jar /opt/boot-demo-docker.jar
RUN sh -c 'touch /opt/boot-demo-docker.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/boot-demo-docker.jar"]