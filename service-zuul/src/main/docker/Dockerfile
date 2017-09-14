FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./service-zuul-0.0.1-SNAPSHOT.jar /app/service-zuul.jar
CMD ["java", "-Xmx200m", "-jar", "/app/service-zuul.jar"]

EXPOSE 8760