FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY $JAR_FILE department-service.jar
ENTRYPOINT ["java","-jar","/department-service.jar.jar"]
EXPOSE 9001