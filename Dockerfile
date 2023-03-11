FROM openjdk:17-alpine
RUN mkdir /app

COPY ./target/*.jar /app

CMD ["java", "-jar", "./app/hello-world.jar"]