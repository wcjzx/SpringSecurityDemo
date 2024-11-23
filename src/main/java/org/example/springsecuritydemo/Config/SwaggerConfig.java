package org.example.springsecuritydemo.Config;



import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
////     初始化创建Swagger Api
//
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                // 详细信息定制
//                .apiInfo(apiInfo())
//                .select()
//                // 指定当前包路径
//                .apis(RequestHandlerSelectors.basePackage("org.example.springsecuritydemo"))
//                // 扫描所有 .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    // 添加摘要信息
//    private ApiInfo apiInfo() {
//        // 用ApiInfoBuilder进行定制
//        return new ApiInfoBuilder()
//                .title("Spring Security开发安全的REST服务")
//                .description("Swagger文档")
//                .contact(new Contact("https://lingmoumou.github.io/", null, null))
//                .version("1.0.0")
//                .build();
//    }
//}