package api.greeting;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // React의 기본 포트
public class GreetingController {

    @GetMapping("/greeting")
    public String getGreeting(){
        return "Hello from Spring Boot!";
    }
}
