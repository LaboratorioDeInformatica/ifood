FROM openjdk:8-jdk-alpine
RUN apk add --no-cache bash
ENTRYPOINT [ "sh", "-c", "java -Duser.timezone=UTC -jar /gateway-0.0.1-SNAPSHOT.jar"]
ADD /target/gateway-0.0.1-SNAPSHOT.jar /gateway-0.0.1-SNAPSHOT.jar
RUN sh -c "touch /gateway-0.0.1-SNAPSHOT.jar"