FROM openjdk:18-jdk-alpine3.15

EXPOSE 8080

RUN apk update \
 apk add --no-cache netcat-openbsb;

COPY /target/gestao-vendas-0.0.1-SNAPSHOT.jar /app/gestao_vendas.jar
COPY /wait-for-mysql.sh /app/wait-for-mysql.sh
WORKDIR /app
#ENTRYPOINT [ "java", "-jar", "/app/gestao_vendas.jar" ]