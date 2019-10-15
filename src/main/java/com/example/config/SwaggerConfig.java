package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: ZJH
 * @Date: 2019/10/15 15:58
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    // swagger接口界面访问路径 ：http://localhost:8088/swagger-ui.html  IP为机器的IP，端口号为工程的端口

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // api接口路径，即controller层路径
                .apis(RequestHandlerSelectors.basePackage("com.example.controller"))
                // 指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API接口文档")
                .description("mybatis接口")
                .version("1.0")
                .build();
    }
}
