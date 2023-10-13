FROM maven:3.6.3-jdk-8 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:8-jre-slim
COPY --from=build /target/springboot-0.0.1-SNAPSHOT.jar springboot.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","springboot.jar"]