FROM eclipse-temurin:21-jre

ARG JAR_FILE=target/backend-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"] 