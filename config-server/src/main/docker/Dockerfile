FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./config-server-0.0.1-SNAPSHOT.jar /app/config-server.jar
CMD ["java", "-Xmx200m", "-jar", "/app/config-server.jar"]

EXPOSE 8750