package org.example.services;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class InitializerService {
    private final Faker faker;

    public InitializerService() {
        faker = new Faker(new Locale("uk"));
    }
}
