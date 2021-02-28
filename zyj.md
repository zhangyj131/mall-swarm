已经配置了apollo，只是把密码等配置了apollo，其余部分还是使用的application.yml

![image-20201222004222037](https://gitee.com/yulewo123/mdpicture/raw/master/docs/20201222004222.png)



mall-gateway说明

这个作为mall-swarm的网关，接入请求从而路由到后面的mall-admin、mall-protal等服务，mall-gateway

webflux执行流程

ReactorHttpHandlerAdapter.apply(HttpServerRequest, HttpServerResponse) line: 56	

WebServerManager$DelayedInitializationHttpHandler.handle(ServerHttpRequest, ServerHttpResponse) line: 97	

HttpWebHandlerAdapter.handle(ServerHttpRequest, ServerHttpResponse) line: 226	

ExceptionHandlingWebHandler.handle(ServerWebExchange) line: 70	

org.springframework.web.server.handler.FilteringWebHandler.handle(ServerWebExchange) line: 59	

接着执行webfilter

![image-20210228235210657](https://gitee.com/yulewo123/mdpicture/raw/master/docs/20210228235210.png)

DispatcherHandler.handle(ServerWebExchange) line: 142	

有可能先执行controller mapping

SimpleHandlerAdapter.handle(ServerWebExchange, Object) line: 45	

org.springframework.cloud.gateway.handler.FilteringWebHandler.handle(ServerWebExchange) line: 76	

org.springframework.cloud.gateway.handler.FilteringWebHandler.DefaultGatewayFilterChain.filter(ServerWebExchange)  遍历执行GatewayFilter

```java
GatewayFilterChain有12个GatewayFilter
[GatewayFilterAdapter{delegate=org.springframework.cloud.gateway.filter.RemoveCachedBodyFilter@2d117280}, order = -2147483648]
[GatewayFilterAdapter{delegate=org.springframework.cloud.gateway.filter.AdaptCachedBodyGlobalFilter@fe09374}, order = -2147482648]
[GatewayFilterAdapter{delegate=org.springframework.cloud.gateway.filter.NettyWriteResponseFilter@e344f14}, order = -1]
[GatewayFilterAdapter{delegate=com.macro.mall.filter.AuthGlobalFilter@28d16af8}, order = 0]
[GatewayFilterAdapter{delegate=org.springframework.cloud.gateway.filter.ForwardPathFilter@21bd6fd1}, order = 0]
[GatewayFilterAdapter{delegate=org.springframework.cloud.gateway.filter.GatewayMetricsFilter@340c7479}, order = 0]
[[RewritePath /mall-admin/(?<remaining>.*) = '/${remaining}'], order = 1] RewritePathGatewayFilterFactory$1
[GatewayFilterAdapter{delegate=org.springframework.cloud.gateway.filter.RouteToRequestUrlFilter@6c2be147}, order = 10000]
[GatewayFilterAdapter{delegate=org.springframework.cloud.gateway.filter.LoadBalancerClientFilter@58932d08}, order = 10100]
[GatewayFilterAdapter{delegate=org.springframework.cloud.gateway.filter.WebsocketRoutingFilter@79e9c14}, order = 2147483646]
[GatewayFilterAdapter{delegate=org.springframework.cloud.gateway.filter.NettyRoutingFilter@45648e75}, order = 2147483647]
[GatewayFilterAdapter{delegate=org.springframework.cloud.gateway.filter.ForwardRoutingFilter@dddcd91}, order = 2147483647]
```



这也就说明了webfilter和golbalfilter的不同了



疑问： spring-gateway是从哪里调用后台服务的？ NettyRoutingFilter



```java
token正则
^Bearer (?<token>[a-zA-Z0-9-._~+/]+)=*$
```



