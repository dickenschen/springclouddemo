FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./service-ribbon-hystrix-0.0.1-SNAPSHOT.jar /app/service-ribbon-hystrix.jar
CMD ["java", "-Xmx200m", "-jar", "/app/service-ribbon-hystrix.jar"]

EXPOSE 8766