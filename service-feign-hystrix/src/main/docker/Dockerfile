FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./service-feign-hystrix-0.0.1-SNAPSHOT.jar /app/service-feign-hystrix.jar
CMD ["java", "-Xmx200m", "-jar", "/app/service-feign-hystrix.jar"]

EXPOSE 8767