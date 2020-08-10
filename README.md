# Spring-Boot-WebService-Example-2
Spring-Boot-WebService-Example 2 for more understanding in The Spring Boot

Web Service powered by Spring Boot
this Spring Boot will contain embeded Apache-Derby Dependency for do the Database CRUD example

You can take "demo-0.0.1-SNAPSHOT.jar" file to run this example in your computer 

API
- "http://localhost:1234/topics" -> for GET,POST Method
  -POST method need JSON like this in RequestBody
  {
    "id":"javascript",
    "name":"JavaScript",
    "description":"JavaScript description"
  }
- "http://localhost:1234/topics/{id}" -> for DELETE, PUT method
  - {id} is "javascript" -> if you POST the above JSON example
  
- "http://localhost:1234/topics/{id} -> for GET, POST method
  - {id} is "javascript" 
  - POST method you can use this JSON for example
  {
    "id":"arrow-function",
    "name":"Javascript arrow-function",
    "description":"Javascript arrow-function description"
  }
  - GET method will be use URL 
    "http://localhost:1234/topics/javascript/courses" -> for all "javascript" id
    "http://localhost:1234/topics/javascript/courses/arrow-function" -> if you know the another id in this example is "arrow-function"
- "http://localhost:1234/topics/javascript/courses/arrow-function" -> for DELETE,PUT method
  
