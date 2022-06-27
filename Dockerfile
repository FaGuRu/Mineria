FROM openjdk:16
ADD target/Mineria.jar Mineria.jar
ENTRYPOINT ["java", "-jar","Mineria.jar"]
