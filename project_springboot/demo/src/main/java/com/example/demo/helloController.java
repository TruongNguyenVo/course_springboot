package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping("/api")
class SimpleController {

    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        String message = "Hello, World!";
        return ResponseEntity.ok(new ApiResponse(message));
    }
    @GetMapping("/bye")
    public ResponseEntity<?> bye() {
        String message = "Good bye";
        String message1 = "Good bye Nguyen";
        ApiResponse[] res = new ApiResponse[2];
        res[0] = new ApiResponse(message);
        res[1] = new ApiResponse(message1);
        
        return ResponseEntity.ok(res);
    }

    

    private static class ApiResponse {
        private final String message;

        public ApiResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
