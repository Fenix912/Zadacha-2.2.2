package web.servise;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> returnQtyOfCar(Integer count);
}
