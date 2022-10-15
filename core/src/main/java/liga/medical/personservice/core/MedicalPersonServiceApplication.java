package liga.medical.personservice.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"liga.medical.personservice"})
public class MedicalPersonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalPersonServiceApplication.class, args);
    }

}