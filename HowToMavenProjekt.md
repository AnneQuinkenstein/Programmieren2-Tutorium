# Umwandlung eines bestehenden Java-Projekts in ein Maven-Projekt

## 1. Erstelle die Maven-Projektstruktur
Die typische Maven-Projektstruktur sieht folgendermaßen aus:
```
your-project/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ └── resources/
│ └── test/
│ ├── java/
│ └── resources/
├── pom.xml
└── target/
```

## 2. Verschiebe deine Quell- und Ressourcen-Dateien
Verschiebe deine bestehenden Quellcodes und Ressourcen in die entsprechenden Verzeichnisse innerhalb des `src/main/java` und `src/main/resources` Ordners. Deine Testdateien sollten in `src/test/java` und `src/test/resources` verschoben werden.

## 3. Erstelle die `pom.xml` Datei
Die `pom.xml` Datei enthält die Projektdetails und die Abhängigkeiten. Ein einfaches Beispiel für eine `pom.xml` Datei sieht so aus:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>your-project</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <!-- Deine Abhängigkeiten kommen hierhin -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

## 4. Füge deine Abhängigkeiten hinzu
Füge alle benötigten Abhängigkeiten in der `pom.xml` Datei hinzu. Du kannst Abhängigkeiten aus dem [Maven Central Repository](https://search.maven.org/) suchen und einfügen.

## 5. Importiere das Projekt in deine IDE

Die meisten modernen IDEs wie IntelliJ IDEA oder Eclipse bieten Unterstützung für Maven. Du kannst dein Projekt in die IDE importieren:

- **IntelliJ IDEA**:
  - Wähle `File` > `Open` und wähle das Verzeichnis deines Projekts.
  - IntelliJ erkennt die `pom.xml` Datei und konfiguriert das Projekt automatisch als Maven-Projekt.

- **Eclipse**:
  - Wähle `File` > `Import`.
  - Wähle `Existing Maven Projects` und navigiere zu deinem Projektverzeichnis.
  - Eclipse importiert das Projekt als Maven-Projekt.

## 6. Baue und führe dein Projekt aus

Du kannst jetzt Maven-Befehle verwenden, um dein Projekt zu bauen und auszuführen. Öffne ein Terminal in deinem Projektverzeichnis und verwende die folgenden Befehle:

- Um das Projekt zu bauen: `mvn clean install`
- Um das Projekt zu testen: `mvn test`
- Um das Projekt zu starten (falls es eine ausführbare JAR erstellt): `mvn exec:java -Dexec.mainClass="com.example.MainClass"`


#  Erstelle ein neues Maven-Projekt in IntelliJ IDEA
1. Öffne IntelliJ IDEA.
2. Wähle `File` > `New` > `Project`.
3. Wähle im neuen Fenster `Maven` aus der Liste und klicke `Next`.
4. Gib die `GroupId` und `ArtifactId` für dein Projekt ein. Beispiel:
    - GroupId: `com.example`
    - ArtifactId: `my-project`
5. Klicke auf `Next` und dann auf `Finish`.