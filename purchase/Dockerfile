FROM openjdk:8-jdk-alpine
RUN apk add --no-cache bash
ENTRYPOINT [ "sh", "-c", "java -Duser.timezone=UTC -jar /purchase-0.0.1-SNAPSHOT.jar"]
ADD /target/purchase-0.0.1-SNAPSHOT.jar /purchase-0.0.1-SNAPSHOT.jar
RUN sh -c "touch /purchase-0.0.1-SNAPSHOT.jar"