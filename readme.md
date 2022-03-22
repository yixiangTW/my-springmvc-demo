run: `./gradlew bootRun`

run: 
`./gradlew build`   
`java -jar build/libs/demo-0.0.1-SNAPSHOT.jar`

run: 指定端口
`java -jar build/libs/demo-0.0.1-SNAPSHOT.jar --server.port=1234`

run: 指定文件
` java -jar build/libs/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=qa`