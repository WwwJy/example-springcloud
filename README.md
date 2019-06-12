# example-springcloud
# 项目运行后相关地址

*eureka地址： http://localhost:8761/*

*仪表盘地址: http://localhost:8753/hystrix*

*仪表盘监控流量地址: http://localhost:8754/turbine.stream*

*健康管理页面: http://localhost:8781/*

## 使用说明
**需要安装rabbitmq插件，同时修改turbine和feign中的rabbitmq连接配置**

## 其他
*参考文档 [spring.io](https://cloud.spring.io/spring-cloud-static/spring-cloud-netflix/2.1.0.RELEASE/single/spring-cloud-netflix.html)*

## 修改说明
V1.0.2：

*1.zuul 配置直连到client端*

*2.feign模块直接加入到client端，两个client端通过feign进行rpc调用。(组件中的example-feign作为配置参考，不需要启动此模块)*

*3.新增spring-admin组件模块*

*4.新增example-client-slave模块，此模块作为第二个client端进行模拟测试，同时里面已经加入feign组件，且已经与example-client打通*

*[个人博客](https://blog.csdn.net/qq_27046703/article/details/91370740)*
