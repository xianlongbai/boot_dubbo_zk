## zookeeper+dubbo的简单搭建使用
### 
### dubbo-admin服务管理平台的安装
1.	去https://github.com/apache/incubator-dubbo下载对应的dubbo-admin源码包
2.	编译admin源码包：mvn clean package -DskipTests
3.	将编译好的war包塞到tomcat中解压，解压完成后修改dubbo.properties配置项
4.	重新启动tomcat即可
5.  注意对应各种版本
    * tomcat  7.x
    * jdk     1.7.x
    * zookeeper   3.4.10
6.  已经编译好一个dubbo-admin-2.5.4.war,放在项目路径下

