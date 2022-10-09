package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImp;

@Controller
public class CarController {
    private final CarServiceImp carServiceImp;

    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        model.addAttribute("cars", carServiceImp.carList(count));
        return "cars";
    }
}


