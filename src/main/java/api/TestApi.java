package api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestApi {

    @GetMapping("/test")
    public ResponseEntity<Object> test() {
        return ResponseEntity.ok("You've reached the test API.");
    }
}
