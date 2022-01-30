FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.11_9_openj9-0.26.0-alpine

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]


