# Spring-Cloud Test #
** 项目用于练习Spring-Cloud 各组件 **


## 模块介绍 ##

Eureka + Ribbon 基础 
- eureka-server:注册中心
- eureka-discovery:服务提供者
- eureka-controller:服务调用者

### ---------------------------------------------------------------------------- ##

Eureka 集群 
- 1 eureka-cluster-server:注册中心
- 2 eureka-cluster-server-copy:注册中心副本
- 3 eureka-cluster-discovery:Eureka客户端
- 4 eureka-cluster-discovery-copy:Eureka客户端副本
- 5 eureka-cluster-ribbon:Ribbon客户端
- 6 eureka-cluster-client:HttpClient请求端
- (依次按顺序启动即可)

**作者：常扬

**邮箱：cy880708@163.com
