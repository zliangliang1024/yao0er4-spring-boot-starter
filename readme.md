## 自定义Starter
> 三方在建立自己的 Starter 的时候命名规则统一用xxx-spring-boot-starter，而官方提供的 Starter 统一命名方式为spring-boot-starter-xxx。
参考：https://blog.csdn.net/fcvtb/article/details/97613955
### docker 启动 Nexus
```bash
docker run -d --name nexus3 --restart=always -p 8081:8081 -p 8082:8082 -p 8083:8083 -p 8084:8084 -p 8085:8085 -v D:\nexus-data:/nexus-data sonatype/nexus3
```
### starter步骤：
#### 1. 创建工程，名为xxx-spring-boot-starter
#### 2. 写抽象方法
#### 3. 编写配置类，创建ConfigurationProperties 保存配置属性
#### 4. 创建自动化配置类 ,创建一个AutoConfiguration，引用定义好的配置信息；在AutoConfiguration中实现所有starter应该完成的操作，并且把这个类加入spring.factories配置文件中进行声明

###  发布jar包到私仓 
* https://blog.csdn.net/kingwinstar/article/details/114629259

#### 问题

```text
transfer failed for http://172.16.100.53:8081/nexus/content/repositories/snapshots/com/yao0er4/biu/yao0er4-spring-boot-starter/1.0-SNAPSHOT/yao0er4-spring-boot-starter-1.0-20220825.065410-1.jar, status: 405 Method Not Allowed
```

* 解决： 需要 和 Repositories 中 type 为 hosted 的 路径一致，否则会报错，所以最好复制

## gradle 引用

* https://juejin.cn/post/7052204121113231396

