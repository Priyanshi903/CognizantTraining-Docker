FROM openjdk:11.0.3-jdk
WORKDIR usr/src
COPY ./target/netflix-eureka-server-0.0.1-SNAPSHOT.jar ./
ENTRYPOINT [ "java","-jar","netflix-eureka-server-0.0.1-SNAPSHOT.jar" ]