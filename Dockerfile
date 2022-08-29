FROM openjdk:8-jdk-slim
LABEL maintainer=wuxiang

COPY target/*.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
