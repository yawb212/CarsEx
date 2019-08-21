package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car = new Car("2019", "Nissan", "Altima");
        repository.save(car);

        car = new Car("2018", "Honda",
                "Accord");
        repository.save(car);

        car = new Car("2017", "Toyot",
                "Corolla");
        repository.save(car);
    }

}
