# Url-shortner
This is a Url shortner application.

**Table of Contents**
1. [Prerequisites to Run the application](#prerequisites-to-run-the-application)
2. [Running the application](#running-the-application)

## Prerequisites to Run the application
- Java
- Docker(Optional)

Steps to install (Steps are for aws-linux-EC2, steps for windows and mac can be googled ) :

1.Docker
```shell script
sudo yum update -y
sudo amazon-linux-extras install docker
sudo service docker start
sudo usermod -a -G docker ec2-user
```

## Running the application
>Note :To run the application using docker you need to have access to image on docker hub.
Docker steps coming soon

Run the Application as a standard Spring application either using IDE or 
```shell
mvn spring-boot:run
```
- You can access the application on [localhost:8080](http://localhost:8080)
- Swagger documentation will be available on [http://localhost:8080/swagger-ui.html#/](http://localhost:8080/swagger-ui.html#/)
                                                                                                       
