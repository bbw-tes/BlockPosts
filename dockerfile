#Image für Java App bauen
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
#mein kompilierter Code vom Host in Container app kopieren.
COPY out/production/Blog /app
EXPOSE 8080
# Was soll ich tun: "Java ausführen", "ClassPath" = aktuller Ordner, Hauptklasse
ENTRYPOINT ["java", "-cp", ".", "bbw.sabina.Main"]