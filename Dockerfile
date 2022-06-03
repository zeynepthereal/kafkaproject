FROM openjdk:18-jdk-alpine
WORKDIR /app
COPY build/libs/kafpack.jar kafpack.jar
ENTRYPOINT ["java","-jar","kafpack.jar"]