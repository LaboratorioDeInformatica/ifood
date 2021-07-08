FROM openjdk:8-jdk-alpine
RUN apk add --no-cache bash
ENTRYPOINT [ "sh", "-c", "java -Duser.timezone=UTC -jar /voucher-0.0.1-SNAPSHOT.jar"]
ADD /target/voucher-0.0.1-SNAPSHOT.jar /voucher-0.0.1-SNAPSHOT.jar
RUN sh -c "touch /voucher-0.0.1-SNAPSHOT.jar"