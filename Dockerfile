FROM openjdk:11-jdk

VOLUME /tmp

COPY target/*.jar test.jar

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev", "/test.jar"]