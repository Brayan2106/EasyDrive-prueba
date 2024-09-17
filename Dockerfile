FROM amazoncorretto:21-alpine-jdk
EXPOSE 8081
COPY target/EasyDrive-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["jave", "-jar","/app.jar"]