FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install

FROM amazoncorretto:17
WORKDIR /app
COPY --from=build /app/target/xueta-0.0.1-SNAPSHOT.jar /app/xueta.jar
EXPOSE 1000
CMD ["java", "-jar", "xueta.jar"]
