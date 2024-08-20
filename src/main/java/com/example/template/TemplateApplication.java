package com.example.template;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(
        servers = {
                @Server(url = "http://여기에url입력:8080", description = "Server URL"),
                @Server(url = "http://localhost:8080",description = "Local URL")
        },
        security = {
                @SecurityRequirement(name = "Auth"),
                @SecurityRequirement(name = "refresh")
        }
)
@SecuritySchemes({
        @SecurityScheme(name = "Auth",
                type = SecuritySchemeType.APIKEY,
                description = "JWT token",
                in = SecuritySchemeIn.HEADER,
                paramName = "Auth"),
        @SecurityScheme(name = "refresh",
                type = SecuritySchemeType.APIKEY,
                description = "JWT refresh token",
                in = SecuritySchemeIn.HEADER,
                paramName = "refresh")
})
@SpringBootApplication
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }

}
