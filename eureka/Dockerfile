FROM openjdk:8-jdk-alpine
RUN apk add --no-cache bash
ENTRYPOINT [ "sh", "-c", "java -Duser.timezone=UTC -jar /eureka-0.0.1-SNAPSHOT.jar"]
ADD /target/eureka-0.0.1-SNAPSHOT.jar /eureka-0.0.1-SNAPSHOT.jar
RUN sh -c "touch /eureka-0.0.1-SNAPSHOT.jar"