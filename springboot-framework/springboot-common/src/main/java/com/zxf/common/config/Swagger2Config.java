package com.zxf.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ConditionalOnExpression("${swagger.enabled:true}")
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
    	Contact contact = new Contact("springtour","http://www.springtour.com","admin@springtour.com");
        return new ApiInfoBuilder()
                .title("RESTful APIs")
                .description("api根地址：http://www.springtour.cn/springtour")
                .termsOfServiceUrl("https://www.springtour.cn/")
                .contact(contact)
                .version("1.0")
                .build();
    }
}
