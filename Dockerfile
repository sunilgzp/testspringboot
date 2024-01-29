FROM amazoncorretto:17
VOLUME /tmp
COPY ./target/test-spring-boot.jar test-spring-boot.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/test-spring-boot.jar"]