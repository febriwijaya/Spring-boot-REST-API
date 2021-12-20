package com.example.demo.services;

import com.example.demo.entities.CarEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarService {
    CarEntity addCar(CarEntity param);

    List<CarEntity> getAllCar();

    CarEntity getCarById(int id);

    CarEntity updateCar(CarEntity param);

    void deleteCar(int id);
}
