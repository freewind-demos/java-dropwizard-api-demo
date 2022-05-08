Java Dropwizard Api Demo
=====================

使用Dropwizard来创建一个api

启动server:

```
mvn clean compile exec:java
```

再另开terminal:

```
http GET 'http://localhost:8080/hello?name=aaa' message=bbb 
```
会得到：
```
{
    "word": "Hello, aaa! (bbb)"
}
```

如果参数验证失败，如：

```
http GET 'http://localhost:8080/hello?name=aaa' message=bb
```

会得到：
```
{
    "errors": [
        "message size must be between 3 and 2147483647"
    ]
}
```