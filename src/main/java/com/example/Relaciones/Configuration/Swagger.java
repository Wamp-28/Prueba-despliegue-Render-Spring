package com.example.Relaciones.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Estudiante")
                        .version("1.0")
                        .description("Documentación de la API para gestionar Estudiantes")
                        .contact(new Contact()
                                .name("Soporte API")
                                .email("wmatallana@ucundinamarca.edu.co")));
    }
}
