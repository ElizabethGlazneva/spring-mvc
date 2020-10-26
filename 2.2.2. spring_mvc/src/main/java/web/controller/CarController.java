package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;


@Controller
@RequestMapping("/cars")
public class CarController {

    private CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }
    @GetMapping()
    public String printCar(ModelMap model) {
        model.addAttribute("cars", carService.carListMethod());
        return "cars";
    }
    @GetMapping(params = "count")
    public String printCar(@RequestParam ("count") int count, ModelMap model) {
        if(count >0 && count <5){
            model.addAttribute("cars", carService.quantityOfCar(count));
        }
        else {
            model.addAttribute("cars", carService.carListMethod());
        }
        return "cars";
    }
}
