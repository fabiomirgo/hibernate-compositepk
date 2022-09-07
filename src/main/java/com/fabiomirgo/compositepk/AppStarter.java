package com.fabiomirgo.compositepk;

import com.fabiomirgo.compositepk.domain.movement.ManualMovementEntity;
import com.fabiomirgo.compositepk.repository.ManualMovementRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackageClasses = {AppStarter.class})
public class AppStarter {

    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class, args);
    }

    @Bean
    ApplicationListener<ApplicationReadyEvent> applicationReadyEventApplicationListener(ManualMovementRepository repository) {
        return event -> {
            Arrays.asList("productA", "productB", "productC").forEach(code -> {
                var entity = new ManualMovementEntity(
                        1,
                        1, null,
                        code,
                        "cosif",
                        "product " + code + " description "
                );
                repository.save(entity);

                System.out.println("\n**********************");
                System.out.println("Current select all: ");
                System.out.println("\n**********************");
                repository.findAll().forEach(movement -> {
                            var message = """
                                    month:  %s,
                                    year: %s,
                                    release: %s,
                                    productCode: %s,
                                    cosifCode: %s,
                                    description: %s
                                    """;
                            System.out.println(
                                    String.format(
                                            message,
                                            movement.getMonth().toString(),
                                            movement.getYear().toString(),
                                            movement.getRelease().toString(),
                                            movement.getProductCode(),
                                            movement.getCosifCode(),
                                            movement.getDescription()
                                    )
                            );
                        }
                );
                System.out.println("\n**********************");
            });

        };
    }
}