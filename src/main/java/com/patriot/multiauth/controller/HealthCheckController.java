package com.patriot.multiauth.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/health")
@Tag(name = "Health Check Controller", description = "Endpoints for testing Swagger configuration")
public class HealthCheckController {

    @GetMapping("/get-call")
    @Operation(
            summary = "Health GET endpoint",
            description = "Returns a simple message to confirm the API is working."
    )
    public ResponseEntity<Map<String, Object>> getHealth() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("status", "UP");
        response.put("timestamp", Instant.now());
        response.put("application", "MultiAuthMethodSystem");
        response.put("version", "1.0.0");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/post-call")
    @Operation(
            summary = "Health POST endpoint",
            description = "Returns the same string you send in the request body."
    )
    public ResponseEntity<Map<String, Object>> postHealth(@RequestBody Map<String, String> payload) {
        // Process payload (e.g., log metrics or status flags)
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "Health status received successfully");
        response.put("receivedAt", Instant.now());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
