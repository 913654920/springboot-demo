package com.zxf.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.webservices.WebServicesAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;

@SpringBootApplication(exclude = { // 禁用spring-boot的一些组件
		JpaRepositoriesAutoConfiguration.class,
		JmxAutoConfiguration.class, WebServicesAutoConfiguration.class, IntegrationAutoConfiguration.class,
		WebSocketAutoConfiguration.class,GroovyTemplateAutoConfiguration.class })
@ServletComponentScan
@AutoConfigurationPackage
@ComponentScan(basePackages={"com.zxf"})
@EnableAsync
@EnableScheduling
@EnableDubboConfiguration
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
}
