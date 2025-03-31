package configuration;

import api.TestApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"api"})
@SpringBootApplication
public class DesignPatternApplication {
    public static void main(String[] args) {
        System.setProperty("server.servlet.context-path", "/design-patterns");
        SpringApplication.run(DesignPatternApplication.class, args);
    }
}
