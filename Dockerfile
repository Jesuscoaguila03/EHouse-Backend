## the base image
#FROM openjdk:17.0.2-jdk-oracle

## the JAR file path
#ARG JAR_FILE=target/*.jar

## Copy the JAR file from the build context into the Docker image
#COPY ${JAR_FILE} backend.jar

#CMD apt-get update -y

## Set the default command to run the Java application
#ENTRYPOINT ["java", "-Xmx2048M", "-jar", "/backend.jar"]

FROM eclipse-temurin:17-jdk AS build

# Establece el directorio de trabajo
WORKDIR /app

# Copia el proyecto al contenedor
COPY . .

# Compila el proyecto usando Maven
RUN ./mvnw clean package

FROM eclipse-temurin:17-jre

# Establece el directorio de trabajo
WORKDIR /app

# Copia el .jar generado desde la etapa de compilación
COPY --from=build /app/target/*.jar app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]




