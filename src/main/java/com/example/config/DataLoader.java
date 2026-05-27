package com.example.config;

import com.example.entity.Address;
import com.example.entity.Userss;
import com.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final UserRepository repository;
    @Override
    public void run(String... args) {

        Address address = Address.builder()
                .city("Kolkata")
                .state("West Bengal")
                .pin_code("700001")
                .build();

        Userss user = Userss.builder()
                .fullname("Rahul Sharma")
                .email("rahul@gmail.com")
                .phone("9876543210")
                .age(25)
                .address(address)
                .build();
        repository.save(user);
        System.out.println("------------------------Sample data loaded------------------------------------");
    }
}