FROM frolvlad/alpine-oraclejdk8:slim
ADD assessment-service-1.0.jar assessment-service.jar
RUN sh -c 'touch /assessment-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/assessment-service.jar"]
