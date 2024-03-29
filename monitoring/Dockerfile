FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ENV CONFIG_SERVICE_PASSWORD=password \
    NOTIFICATION_SERVICE_PASSWORD=password \
    STATISTICS_SERVICE_PASSWORD=password \
    ACCOUNT_SERVICE_PASSWORD=password \
    MONGODB_PASSWORD=password

ADD ./target/monitoring.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/monitoring.jar"]

EXPOSE 8080