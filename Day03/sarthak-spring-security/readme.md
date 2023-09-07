

## Student protected url with spring security

### build application

    mvn clean install

## Run Application
    mvn spring-boot:run

## send request

    user username and password(user123,password)
    adminrole username and password(admin123,password)
    adminrole username and password(sarthak123,123XYZ)

## Send request

    curl --location --request GET 'http://localhost:8080/getstudent' --header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' 

    curl --location --request DELETE 'http://localhost:8080/deletestudent' --header 'Authorization: Basic YWRtaW4xMjM6cGFzc3dvcmQ=' 

    curl --location --request PUT 'http://localhost:8080/deletestudent' --header 'Authorization: Basic YWRtaW4xMjM6cGFzc3dvcmQ=' 


## Create docker image

    mvn install dockerfile:build

## Run docker image

    docker run -p 8080:8080 Sarthak004/sarthak-spring-security:0.0.1fi