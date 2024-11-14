# SSF Day 11 Lecture

## Maven Compiler commands
### Clean project
Removes target root folder and packages. 

In project root folder:
`./mvnw clean` or `mvnw.cmd clean` (for Windows)

### Packaging project
Packages the compiled bytecode classes into a .jar or .war file. 
`.mvnw package` or `mvnw.cmd package`

### Clean and package
Cleans any existing target folder and pacakges, and redownloads them. 
`./mvnw clean package` or `mvnw.cmd clean package`

### Run JAR file
`java -jar (jar file)`

### Run application in embedded localhost server
`./mvnw spring-boot:run` or `mvn.cmd spring-boot:run`