# 组件

* [Nacos](https://github.com/alibaba/Nacos)：一个更易于构建云原生应用的动态服务发现、配置管理和服务管理平台。

* [Sentinel](https://github.com/alibaba/Sentinel)：把流量作为切入点，从流量控制、熔断降级、系统负载保护等多个维度保护服务的稳定性。

* [RocketMQ](https://rocketmq.apache.org/)：一款开源的分布式消息系统，基于高可用分布式集群技术，提供低延时的、高可靠的消息发布与订阅服务。

* [Dubbo](https://github.com/apache/dubbo)：Apache Dubbo™ 是一款高性能 Java RPC 框架。

* [Seata](https://github.com/seata/seata)：阿里巴巴开源产品，一个易于使用的高性能微服务分布式事务解决方案。

#### 组件版本关系

Spring Cloud Alibaba Version | Sentinel Version | Nacos Version | RocketMQ Version | Dubbo Version | Seata Version
--- | --- | --- | --- | --- | ---
2.2.3.RELEASE or 2.1.3.RELEASE or 2.0.3.RELEASE | 1.8.0 | 1.3.3 | 4.4.0 | 2.7.8 | 1.3.0
2.2.1.RELEASE or 2.1.2.RELEASE or 2.0.2.RELEASE | 1.7.1 | 1.2.1 | 4.4.0 | 2.7.6 | 1.2.0
2.2.0.RELEASE | 1.7.1 | 1.1.4 | 4.4.0 | 2.7.4.1 | 1.0.0
2.1.1.RELEASE or 2.0.1.RELEASE or 1.5.1.RELEASE | 1.7.0 | 1.1.4 | 4.4.0 | 2.7.3 | 0.9.0
2.1.0.RELEASE or 2.0.0.RELEASE or 1.5.0.RELEASE | 1.6.3 | 1.1.1 | 4.4.0 | 2.7.3 | 0.7.1

#### 毕业版本依赖关系(推荐使用)

Spring Cloud Version | Spring Cloud Alibaba Version | Spring Boot Version
--- | --- | ---
Spring Cloud Hoxton.SR8 | 2.2.3.RELEASE | 2.3.2.RELEASE
Spring Cloud Greenwich.SR6 | 2.1.3.RELEASE | 2.1.13.RELEASE
Spring Cloud Hoxton.SR3 | 2.2.1.RELEASE | 2.2.5.RELEASE
Spring Cloud Hoxton.RELEASE | 2.2.0.RELEASE | 2.2.X.RELEASE
Spring Cloud Greenwich | 2.1.2.RELEASE | 2.1.X.RELEASE
Spring Cloud Finchley | 2.0.3.RELEASE | 2.0.X.RELEASE
Spring Cloud Edgware | 1.5.1.RELEASE(停止维护，建议升级) | 1.5.X.RELEASE

## Nacos
官网 https://nacos.io/zh-cn/index.html

```
# 单机测试
# linux / mac
sh startup.sh -m standalone
# Wiondows
cmd startup.cmd -m standalone

# 启动后浏览器访问 http://127.0.0.1:8848/nacos/index.html 默认账号nacos 密码nacos
```

## Sentinel
官网 https://sentinelguard.io/zh-cn/

```
# 其中 -Dserver.port=8718 用于指定 Sentinel 控制台端口为 8718
# 参数 -Dcsp.sentinel.dashboard.server=consoleIp:port 指定控制台地址和端口
# 通过 -Dcsp.sentinel.api.port=xxxx 指定客户端监控 API 的端口（默认是 8719）
# -Dsentinel.dashboard.auth.username=sentinel 用于指定控制台的登录用户名为 sentinel；
# -Dsentinel.dashboard.auth.password=123456 用于指定控制台的登录密码为123456；如果省略这两个参数，默认用户和密码均为 sentinel；
# -Dserver.servlet.session.timeout=7200 用于指定 Spring Boot 服务端 session 的过期时间，如7200 表示 7200 秒；60m 表示 60 分钟，默认为 30 分钟；
java -Dserver.port=8718 -Dcsp.sentinel.dashboard.server=127.0.0.1:8718 -Dcsp.sentinel.api.port=8719 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.8.0.jar

# 启动后浏览器访问 http://127.0.0.1:8718 默认账号sentinel 密码sentinel
```

## 参考
* [Spring Cloud Alibaba系列教程](https://www.jianshu.com/p/9a8d94c0c90c)
* [SpringCloudAlibabaLearn](https://github.com/dengly/SpringCloudAlibabaLearn) 

