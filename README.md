# otel-test-application
Run these two applications with the following VM Options
```
-javaagent:/path/to/opentelemetry-javaagent.jar
-Dotel.resource.attributes=service.name=web-app
-Dotel.traces.exporter=logging
-Dotel.metrics.exporter=none
```

then exec the command `curl --max-time 5 -XGET http://127.0.0.1:8080/first` to send a request and see the `web-app` console log, will find the span name `/first`(from netty instrumentation) was missed.
if exec the command `curl --max-time 12 -XGET http://127.0.0.1:8080/first` everything is ok. 


