FROM eclipse-temurin:17-jdk-jammy
EXPOSE 8080
ADD target/demo-docker-jenkins.jar demo-docker-jenkins.jar
ENTRYPOINT ["java","-jar","demo-docker-jenkins.jar"]