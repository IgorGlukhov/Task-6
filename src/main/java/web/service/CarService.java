package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("Toyota", "Camry", "green"));
        cars.add(new Car("Honda", "Civic", "blue"));
        cars.add(new Car("Ford", "Mustang", "red"));
        cars.add(new Car("Chevrolet", "Malibu", "black"));
        cars.add(new Car("BMW", "X5", "yellow"));
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
