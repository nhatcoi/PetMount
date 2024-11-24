FROM openjdk:17

ARG JAR_FILE=build/libs/PetMount.jar
COPY ${JAR_FILE} PetMount.jar
ENTRYPOINT ["java", "-jar", "PetMount.jar"]

EXPOSE 8080
