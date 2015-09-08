# helloworld-java

This project is a Hello World dependency for Java.

[Blog post on how to publish to Maven Central & jCenter](https://medium.com/@ryanseys/publishing-to-maven-central-and-jcenter-2b6376424856)

## Install

Install using Gradle:

```groovy
compile 'com.ryanseys:helloworld:1.0.2'
````

## Usage

```java
import com.ryanseys.helloworld.Hello;
// ...
String g = new Hello().getGreeting();
```

## License

Apache 2.0
