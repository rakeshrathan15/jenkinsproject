FROM openjdk:17-jdk-slim

COPY ./target/docker-0.0.1-SNAPSHOT.jar /docker.jar


ENTRYPOINT ["java", "-jar", "/docker.jar"]



