package com.patriot.multiauth.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI appSwaggerConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title("🔐 Multi-Method Auth API")
                        .description("Enterprise-grade multi-tenant authentication system with support for DB, LDAP, OAuth, SAML, and Custom methods.")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Security Team")
                                .email("security@yourcompany.com")
                                .url("https://yourcompany.com"))
                        .license(new License().name("MIT License").url("https://opensource.org/licenses/MIT")))
                .externalDocs(new ExternalDocumentation()
                        .description("Full Documentation")
                        .url("https://yourcompany.com/docs"));
    }
}
