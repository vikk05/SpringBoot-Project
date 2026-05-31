package car.example.ComponentScanAnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "car.example.ComponentScanAnotation")
public class AppConfig {
}
