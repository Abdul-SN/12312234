package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW 340d", "Black", "А111БВ 11"));
        cars.add(new Car("Audi A6", "White", "А222БВ 22"));
        cars.add(new Car("Toyota Camry", "Blue", "А333БВ 33"));
        cars.add(new Car("ВАЗ 2112", "Silver", "А444БВ 44"));
        cars.add(new Car("Volkswagen Golf", "Green", "А555БВ 55"));
    }

    public List<Car> getFewCars(int count) {
        return cars.stream().limit(count).toList();
    }

    public List<Car> getCars() {
        return cars;
    }
}
