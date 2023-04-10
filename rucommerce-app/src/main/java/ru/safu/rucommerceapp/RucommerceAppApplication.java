package ru.safu.rucommerceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.safu.rucommerceapp.constants.Constants;


@EntityScan(Constants.ENTITY_PACKAGE)
@EnableJpaRepositories(Constants.REPOSITORY_PACKAGE)
@SpringBootApplication()
public class RucommerceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RucommerceAppApplication.class, args);
    }

}
