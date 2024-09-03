FROM openjdk:21
COPY ./target/customerservice.jar customerservice.jar
CMD ["java","-jar","customerservice.jar"]
