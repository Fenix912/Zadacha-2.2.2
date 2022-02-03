package web.servise;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServiseImpl implements CarService {

    private final CarDao carDao;

    public CarServiseImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> returnQtyOfCar(Integer count) {
        return carDao.returnQtyOfCar(count);
    }
}
