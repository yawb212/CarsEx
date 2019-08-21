package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Car {

    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull

    private String year;

    @NotNull

    private String make;

    @NotNull

    private String model;

    public Car(@NotNull String year, @NotNull String make, @NotNull String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public Car() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}


