package com.client;

import com.client.bean.Client;
import com.client.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository) {

        return args -> {
            clientRepository.save(new Client("mohcine", "ait ellattar", "marrakech", 062514514, "email"));
            clientRepository.save(new Client("zakaria", "lachger", "marrakech", 062514514, "email"));
            clientRepository.save(new Client("ismail", "derkaoui", "marrakech", 062514514, "email"));
            clientRepository.save(new Client("khadija", "lemtouni", "marrakech", 062514514, "email"));


        };
    }

}
