package com.adryjanowski.SpringBoot_DietApp_2025.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("DietAPP API")
                        .version("1.0.0")
                        .description("DietApp Spring Boot application with Swagger 3")
                        .contact(new Contact()
                                .name("Jarosław Adryjanowski")
                                .email("you@example.com")));
    }
}
