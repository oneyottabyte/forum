FROM openjdk:17-jdk
WORKDIR /app
COPY target/forum.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Xmx512m", "-jar", "app.jar"]