FROM openjdk:11-jdk-slim

COPY target/easybot-test-task-0.0.1-SNAPSHOT.jar /app.jar

CMD java -jar app.jar
