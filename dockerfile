FROM openjdk:8
COPY target/dockerDemo-1.0-SNAPSHOT.jar dockerDemo-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/dockerDemo-1.0-SNAPSHOT.jar"]