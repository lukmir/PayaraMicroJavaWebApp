FROM java:8-jdk-alpine
MAINTAINER lukmir

ENV APP_LOCATION /target/PayaraMicroJavaWebApp.jar
ENV APP_NAME app.jar

ADD $APP_LOCATION $APP_NAME
RUN chmod +x $APP_NAME

EXPOSE 9898

ENTRYPOINT java -jar $APP_NAME