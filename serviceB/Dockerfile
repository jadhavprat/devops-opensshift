# Build stage
FROM maven:3.9.4-eclipse-temurin-21 AS build
WORKDIR /app

# Copy project files
COPY pom.xml .
COPY src ./src

# Build the project
RUN mvn -q -DskipTests package

# Final image
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /app/target/serviceB-1.0.0.jar app.jar

EXPOSE 9091
ENTRYPOINT ["java", "-jar", "app.jar"]

