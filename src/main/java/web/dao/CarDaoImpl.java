package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Jaguar", 350 , "Blue"));
        cars.add(new Car("Skoda", 7, "Red"));
        cars.add(new Car("BMW", 6, "White"));
        cars.add(new Car("Volvo", 30,  "Silver"));
        cars.add(new Car("Mazda", 3, "Black"));

    }

    @Override
    public List<Car> returnQtyOfCar(Integer count) {
        if(count > 5 || count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}