FROM eclipse-temurin:21-jdk-alpine
VOLUME /tmp
RUN addgroup -S istory && adduser -S istory -G istory
USER istory
WORKDIR /home/istory
COPY ubarial-0.0.1-SNAPSHOT.jar /home/istory/istory.jar
ENTRYPOINT ["java", "-jar", "/home/istory/istory.jar"]
# docker run -p 8080:8080