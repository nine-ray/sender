# sender
邮件发送服务，邮件通知。
根据传入的发件人信息和收件人信息发送对应邮件。

环境：jdk 11+spring boot 2.3.5 
依赖：
```
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-mail</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
```
1.发送普通邮件<br />
  请求地址：/mail/send  <br />
  请求方式：post  <br />
  参数示例：
  ```
  {
  "to": "xx@qq.com",//收件人
  "from":"xxx@163.com",//发件人
  "subject":"第er发",//主题
  "content":"zhi是cess2",//内容
  "password": "授权码非登录密码，登录相应邮箱查看",
  "type":"MAIL_163"//MAIL_QQ、MAIL_126、MAIL_163、MAIL_YEAH。支持发送的邮箱类型
  }
  ```






