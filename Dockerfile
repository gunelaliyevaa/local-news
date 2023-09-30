FROM openjdk:latest

COPY build/libs/local-news-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]