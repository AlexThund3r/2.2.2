package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Peugeot", "White", 2018),
            new Car("Renault", "Gray", 2019),
            new Car("Ford", "Black", 2020),
            new Car("Mercedes", "Blue", 2021),
            new Car("Mitsubishi", "Red", 2022)
    );

    @Override
    public List<Car> getCars(int count) {
        return count >= 5 ? cars : cars.subList(0, count);
    }
}
