package io.jacobs.stu.springcloud.eureka;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EurekaServerDemoApplication {
	public static void main(String[] args) {

		SpringApplication.run(EurekaServerDemoApplication.class, args);
		Logger.getLogger(EurekaServerDemoApplication.class)
				.info("注册中心启动了。。。。");
	}
}
