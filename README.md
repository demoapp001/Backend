# Adatbázis használat gyakorlatban

## Web Applikáció

```
          *------*   - HTML, CSS
          |  UI  |   - JavaScript
          *------*   - React
              ^      - Angular
              |
      API <-- |
              |
              v
        *-----------*
        |  Backend  | - Java
        *-----------*
              ^
              |
              |
              |
              v
          *------*    - MySql 
          |  DB  |    - Oracle
          *------*    - Db2
```

## Fejlesztői környezet

- [OpenJDK-17.0.2](https://download.java.net/java/GA/jdk17.0.2/dfd4a8d0985749f896bed50d7138ee7f/8/GPL/openjdk-17.0.2_windows-x64_bin.zip) - Környezeti változók: JAVA_HOME, PATH
- [Maven](https://dlcdn.apache.org/maven/maven-3/3.8.4/binaries/apache-maven-3.8.4-bin.zip) - Környezeti változók: MAVEN_HOME, PATH
- [Spring Tool](https://spring.io/tools)
- [Eclipse](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-12/R/eclipse-inst-jre-win64.exe&mirror_id=1) or [Visual Studio Code](https://code.visualstudio.com/Download) - Eclipse IDE for Enterprise Java and Web Developers
- [Git](https://git-scm.com/download/win)
- [Postman](https://www.postman.com/downloads/)


## Spring

[start.spring.io](https://start.spring.io/)

- Project: *Maven Project*
- Spring Boot: *2.6.3*
- Project Metadata:
  + Group: *edu.reallife.example*
  + Artifact:*demo*
  + Name: *database-example*
  + Description: *Real life example application structure using database*
  + Paackage name: *edu.reallife.example*
- Packaging: *jar*
- Java: *17*
- Dependencies:
  + *Spring Web*

### Maven

[Maven Archetypes](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html)

```
mvn archetype:generate -DgroupId=test -DartifactId=demo -D archetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

**.m2** könyvtár: A *maven* ebbe a könyvtárba tölti le és tárolja lokálisan a *java* könyvtárakat.

### Annotációk

- **@Component** - Általános célu komponenes
  + **@RestController** - Rest Api (Átirányítja a forgalmat)
  + **@Service** - Business logika
  + **@Repository** - Adathozzáférési réteg 

#### Folyamat

```

                                                                                               --- 
     -----          * --------------- *     * --------------- *     * --------------- *      /     \
   /       \        |                 |     |                 |     |                 |     |\     /|
  |   user  | ----> | @RestController | --> |    @Servive     | --> |   @Repository   | --> |  ---  |
   \       /        |                 |     |                 |     |                 |     |   DB  |
     -----          * --------------- *     * --------------- *     * --------------- *      \     /
                                                                                               --- 

```

### Scope

- Singleton
- Prototype
- Request
- Session
- Global Session

### REST API

A **REST** az egy standard API-ok készítéséhez, amelyik **HTTP** protokollon keresztül működik.

#### HTTP

HTTP Kérés: [http://localhost:8080/login]

- http: protokol
- localhost: IP cím
- 8080: port
- login: API metódus elérése

HTTTP Metódus
- GET, POST, PUT, DELETE, PATCH

HTTP Header
- Fontos infó a lekérdezéssel kapcsolatban (pl. Autentikálás)

Request Body
- A lekérdezéshez tartozó adatok JSON

#### CRUD 

- Create **POST**
- Read **GET**
- Update **PUT**
- Delete **DELETE**
