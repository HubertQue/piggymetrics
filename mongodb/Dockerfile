FROM mongo:3
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ENV CONFIG_SERVICE_PASSWORD=password \
    NOTIFICATION_SERVICE_PASSWORD=password \
    STATISTICS_SERVICE_PASSWORD=password \
    ACCOUNT_SERVICE_PASSWORD=password \
    MONGODB_PASSWORD=password

ADD init.sh /init.sh
ADD ./dump /

RUN \
 chmod +x /init.sh && \
 apt-get update && apt-get dist-upgrade -y --force-yes && apt-get install dos2unix && \
 apt-get install psmisc -y -q && \
 apt-get autoremove -y && apt-get clean && \
 rm -rf /var/cache/* && rm -rf /var/lib/apt/lists/* && \
 dos2unix -n /init.sh /initx.sh && chmod +x /initx.sh

ENTRYPOINT ["/initx.sh"]