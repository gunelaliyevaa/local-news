package az.atlacademy.localnews;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Local News REST API", version = "1.1"))
public class LocalNewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalNewsApplication.class, args);
    }

}
