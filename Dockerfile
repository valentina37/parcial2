FROM openjdk:17
COPY "./target/ParcialDannaPruebas-1.jar" "app.jar"
EXPOSE 8020
ENTRYPOINT [ "java", "-jar", "app.jar" ]
