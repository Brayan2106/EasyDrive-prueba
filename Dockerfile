FROM amazoncorretto:17-alpine-jdk
MAINTAINER ESMERALDA
COPY target/EasyDrive-0.0.1-SNAPSHOT.jar EasyDrive-pruebaBackend.jar
ENTRYPOINT ["jave", "-jar","EasyDrive-pruebaBackend.jar"]