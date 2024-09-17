FROM amazoncorretto:17-alpine-jdk
EXPOSE 8081
COPY target/EasyDrive-0.0.1-SNAPSHOT.jar EasyDrive-prueba.jar
ENTRYPOINT ["jave", "-jar","EasyDrive-prueba.jar"]