FROM openjdk:17
WORKDIR /umapp
COPY ./target/usermanagement.jar /umapp
EXPOSE 8080
CMD [ "java" ,"-jar" , "usermanagement.jar"]