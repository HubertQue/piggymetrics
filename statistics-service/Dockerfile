FROM openjdk:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ENV CONFIG_SERVICE_PASSWORD=password \
    NOTIFICATION_SERVICE_PASSWORD=password \
    STATISTICS_SERVICE_PASSWORD=password \
    ACCOUNT_SERVICE_PASSWORD=password \
    MONGODB_PASSWORD=password

ADD ./target/statistics-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/statistics-service.jar"]

EXPOSE 7000