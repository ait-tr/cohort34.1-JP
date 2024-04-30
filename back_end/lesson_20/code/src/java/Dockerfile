FROM eclipse-temurin:17-jre-alpine

LABEL authors="edward"

WORKDIR /app

COPY ./target/forum-service-0.0.1-SNAPSHOT.jar ./forum-service.jar

ENV MONGODB_URI=your_mongodb_uri

CMD ["java", "-jar", "/app/forum-service.jar"]