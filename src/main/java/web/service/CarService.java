package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    // Метод для получения нескольких атвомобилей
    public List<Car> getFewCars(int count);

    // Метод для получения всего списка автомобилей
    public List<Car> getCars();


}
