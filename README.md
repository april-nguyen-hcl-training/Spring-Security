# Secure Authenticator

Secure Authenticator is a Java Spring MVC web app with Hibernate that redirect users to a login.html page if not authenticated before being redirected to the original page once authenticated.

## Installation

Use [docker](https://docs.docker.com/get-docker/) for database.

```bash
docker-compose --file docker/compose.yaml up --build -d
```
Run in IDE by importing /secure-authenticator 
or by using Maven
```bash
cd secure-authenticator/
mvn spring-boot:run
```

## Usage

Going to [http://localhost:8081/hello](http://localhost:8081/hello) should redirect to login page if not authenticated and once authenticated, returns back to hello page.

## Stopping

```bash
docker-compose --file docker/compose.yaml down
```

## License
[MIT](https://choosealicense.com/licenses/mit/)
