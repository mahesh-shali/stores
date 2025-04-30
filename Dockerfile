# Use OpenJDK as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot jar file into the container
COPY target/stores-0.0.1-SNAPSHOT.jar /app/stores-0.0.1-SNAPSHOT.jar

# Expose the port that Spring Boot runs on
EXPOSE 8900

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/stores-0.0.1-SNAPSHOT.jar"]
