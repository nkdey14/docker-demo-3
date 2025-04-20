FROM openjdk:17

COPY target/demo-app-3.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "demo-app-3.jar"]