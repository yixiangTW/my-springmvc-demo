package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CarService {

    private Map<Integer, Car> carMap = new HashMap<>();

    public CarService() {
        carMap.put(1, new Car(1, "BMW", "white"));
        carMap.put(2, new Car(2, "Benz", "black"));
    }

    public List<Car> getAllCars(String color) {
        return carMap.values().stream()
                .filter(car -> color == null || car.getColor().equals(color))
                .collect(Collectors.toList());
    }

    public void createCar(Car car) {
        carMap.put(car.getId(), car);
    }

    public Car getCarById(Integer id) {
        return carMap.get(id);
    }

}
