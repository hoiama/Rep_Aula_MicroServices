package br.com.swagger.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 //enables Swagger support in the class.
public class SwaggerConfig extends WebMvcConfigurationSupport {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select() //returns an instance of ApiSelectorBuilder that provides the apis() and paths()
                .apis(RequestHandlerSelectors.any()) //Using any() for both will make documentation for your entire API, filter the API.
                .paths(PathSelectors.regex("/test.*")) //additional filter only for the path starting with /product.
                .build()
                .apiInfo(metaDataApiInfo());

    }
    @Override //To support Swagger UI, extend WebMvcConfigurationSupport, add two resource handlers
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    private ApiInfo metaDataApiInfo(){
        return new ApiInfoBuilder()
                .title("Teste de Spring Swagger-UI")
                .description("Testando a implementação do swagger-ui")
                .version("1.0")
                .license("Opem")
                .contact("43234-432432")
                .build();
    }
}

