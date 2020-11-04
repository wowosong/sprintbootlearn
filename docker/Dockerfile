#FROM  registry.cn-hangzhou.aliyuncs.com/ycl_hbd/hbd:jdk-1.8-alpine
FROM registry.cn-hangzhou.aliyuncs.com/nibo/special-tomcat
MAINTAINER Richard <nibocn@gmail.com>

WORKDIR /opt

ENV TZ=Asia/Shanghai
RUN mkdir /opt/app \
    && ln -snf /usr/share/zoneinfo/$TZ /etc/localtime \
    && echo $TZ > /etc/timezone

EXPOSE 8085

ENV RESERVED_MEGABYTES 64
COPY demo-0.0.1-SNAPSHOT.jar /opt/app
COPY entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

CMD ["/entrypoint.sh"]

HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:8085/health || exit 1