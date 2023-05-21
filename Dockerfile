FROM openjdk:17-slim 
COPY target/Medicare-Backend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","-D spring.datasource.url=jdbc:mysql://54.91.206.118:3306/medicare","app.jar"]
