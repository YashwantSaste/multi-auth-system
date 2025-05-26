Here's folder structure for the multi-method authentication backend project using Spring Boot:

---

## 📁 Project Structure – `auth-multimethod-backend`

```
auth-multimethod-backend/
├── .mvn/
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
├── .gitignore
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── patriot/
│   │   │           └── multiauth/
│   │   │               ├── AuthSystemApplication.java
│   │   │
│   │   │               ├── config/
│   │   │               │   ├── SecurityConfig.java
│   │   │               │   ├── LdapConfig.java
│   │   │               │   ├── SamlConfig.java
│   │   │               │   ├── JwtConfig.java
│   │   │               │   └── OAuthConfig.java
│   │   │
│   │   │               ├── controller/
│   │   │               │   └── AuthController.java
│   │   │
│   │   │               ├── dto/
│   │   │               │   ├── LoginRequest.java
│   │   │               │   ├── JwtResponse.java
│   │   │               │   └── ProviderConfigDto.java
│   │   │
│   │   │               ├── enums/
│   │   │               │   └── AuthProviderType.java
│   │   │
│   │   │               ├── exception/
│   │   │               │   └── GlobalExceptionHandler.java
│   │   │
│   │   │               ├── model/
│   │   │               │   └── User.java
│   │   │
│   │   │               ├── repository/
│   │   │               │   └── UserRepository.java
│   │   │
│   │   │               ├── security/
│   │   │               │   ├── JwtTokenProvider.java
│   │   │               │   ├── JwtAuthenticationFilter.java
│   │   │               │   └── CustomUserDetailsService.java
│   │   │
│   │   │               ├── service/
│   │   │               │   ├── AuthService.java
│   │   │               │   ├── OAuthService.java
│   │   │               │   ├── SamlService.java
│   │   │               │   ├── LdapService.java
│   │   │               │   └── StrategyContext.java
│   │   │
│   │   │               └── strategy/
│   │   │                   ├── AuthenticationStrategy.java
│   │   │                   ├── UsernamePasswordStrategy.java
│   │   │                   ├── OAuthStrategy.java
│   │   │                   ├── SamlStrategy.java
│   │   │                   └── LdapStrategy.java
│   │   │
│   │   └── resources/
│   │       ├── application.yml
│   │       ├── application-dev.yml
│   │       ├── application-prod.yml
│   │       └── logback-spring.xml
│
│   └── test/
│       └── java/
│           └── com/
│               └── patriot/
│                   └── mutliauth/
│                       ├── controller/
│                       ├── service/
│                       └── AuthSystemApplicationTests.java
```

---
