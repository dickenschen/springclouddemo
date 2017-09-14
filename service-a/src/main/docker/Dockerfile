FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./service-a-0.0.1-SNAPSHOT.jar /app/service-a.jar
CMD ["java", "-Xmx200m", "-jar", "/app/service-a.jar"]

EXPOSE 8762