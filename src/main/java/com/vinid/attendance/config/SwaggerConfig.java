package com.vinid.attendance.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        // @formatter:off
        //Register the controllers to swagger
        //Also it is configuring the Swagger Docket
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                 .apis(RequestHandlerSelectors.basePackage("com.vinid.attendance"))
//                .apis(Predicates.not(RequestHandlerSelectors.basePackage("com.vinid.attendance")))

                .paths(PathSelectors.any())
//                .paths(PathSelectors.ant("/document"))
//                .paths(PathSelectors.ant("/*"))
                .build().apiInfo(apiEndPointsInfo());
        // @formatter:on
    }
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry)
//    {
//        //enabling swagger-ui part for visual documentation
//        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }


//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addRedirectViewController("/documentation/v2/api-docs", "/v2/api-docs").setKeepQueryParams(true);
//        registry.addRedirectViewController("/documentation/swagger-resources/configuration/ui", "/swagger-resources/configuration/ui");
//        registry.addRedirectViewController("/documentation/swagger-resources/configuration/security", "/swagger-resources/configuration/security");
//        registry.addRedirectViewController("/documentation/swagger-resources", "/swagger-resources");
//    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/documentation/**").addResourceLocations("classpath:/META-INF/resources/");
//    }
private ApiInfo apiEndPointsInfo() {
    return new ApiInfoBuilder().title("Spring Boot REST API")
            .description("Employee Management REST API")
            .contact(new Contact("An Nguyen", "fb.com/error11111505", "nguyenvanan11061997@gmail.com"))
            .license("Apache 2.0")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .version("1.0.0")
            .build();
}
}