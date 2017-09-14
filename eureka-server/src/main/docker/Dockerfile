FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./eureka-server-0.0.1-SNAPSHOT.jar /app/eureka-server.jar
CMD ["java", "-Xmx200m", "-jar", "/app/eureka-server.jar"]

EXPOSE 8761