package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        CarDao carDao = new CarDao();
        System.out.println(count);
        model.addAttribute("cars", carDao.getCar(count));
        return "cars";
    }
}
