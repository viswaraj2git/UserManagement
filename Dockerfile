FROM openjdk:17
WORKDIR /umapp
COPY ./target/usermanagement.jar /umapp
EXPOSE 8010
CMD [ "java" ,"-jar" , "usermanagement.jar"]