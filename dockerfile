#Image für Java App bauen
FROM eclipse-temurin:20-jdk-alpine
WORKDIR /app
#main kompilierter Code vom Host in Container app kopieren.
COPY out/production/Blog /app
EXPOSE 8080
RUN ls -R /app
# Was soll ich tun: "Java ausführen", "ClassPath" = aktuller Ordner, Hauptklasse
ENTRYPOINT ["java", "-cp", ".", "bbw.sabina.Main"]