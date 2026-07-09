# Step 1: Build the application using Maven
FROM maven:3.8.5-openjdk-17 AS build
COPY . .
# Runs clean build while skipping local test suites to speed up deployment
RUN mvn clean package -DskipTests

# Step 2: Create a lightweight runtime container
FROM openjdk:17-jdk-slim
# Matches your exact <artifactId> and <version> tags from pom.xml
COPY --from=build /target/application-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]