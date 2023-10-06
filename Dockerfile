FROM openjdk:22-ea-16-jdk-oracle
ADD target/client-1.0-SNAPSHOT.jar my-maven-docker-project.jar
CMD ["java", "-jar", "my-maven-docker-project.jar"]
EXPOSE 5050
