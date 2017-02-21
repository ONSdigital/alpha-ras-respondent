FROM openjdk
MAINTAINER David Carboni

WORKDIR /app
ADD build/libs/*.jar .
ENV server.port 8080

CMD java -jar ./*.jar
