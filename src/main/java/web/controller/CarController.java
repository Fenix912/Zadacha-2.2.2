package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.servise.CarService;

@Controller //указывается класс контроллеров
public class CarController {

    private final CarService carsService;

    public CarController(CarService carsService) {
        this.carsService = carsService;
    }


    @GetMapping(value = "/cars") //Маппинг связывает метод контроллера с адресом, по которому можно к этому методу обратиться например из браузера
    public String printCars(String count, ModelMap model) {
        model.addAttribute("cars", carsService.returnQtyOfCar(Integer.parseInt(count)));
        return "cars";
    }
}
