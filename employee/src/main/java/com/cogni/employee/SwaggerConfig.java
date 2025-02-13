package com.cogni.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

/**
 * Swagger configuration for the Employee API.
 */
@Configuration
public class SwaggerConfig {

    /**
     * Custom OpenAPI configuration.
     * @return OpenAPI instance with API information.
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Employee API")
                        .version("1.0")
                        .description("API documentation for Employee management"));
    }
}